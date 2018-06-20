package consumer;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.SSLException;

import org.apache.commons.httpclient.cookie.CookiePolicy;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.http.ConnectionClosedException;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.GzipDecompressingEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import tools.UrlConsolidator;

public  class DefaultHttpClientConnectionEngine extends AbstractConnectionEngine {

	private String TEST_SITE = null;

	private static final int MAX_PAGE_RETRY_COUNT = 2;

	public String getTEST_SITE() {
		return TEST_SITE;
	}

	public void setTEST_SITE(String tEST_SITE) {
		TEST_SITE = tEST_SITE;
		configureSiteDomain();
	}

	private String proxy = null;
	private int proxyPort = 0;
	private String host;
	private DefaultHttpClient httpClient;
	private UrlConsolidator urlConsolidator;

	public DefaultHttpClientConnectionEngine(String url) {
		this.TEST_SITE = url;
		configureSiteDomain();
	}

	public DefaultHttpClientConnectionEngine() {
		configureEngine();
	}

	private void configureEngine() {

		//peru
//		 proxy = "200.48.210.5";
//		 proxyPort = 53281;
		httpClient = createClient();
	}

	private String cleanPath(final String path) {
		return urlConsolidator.consolidateUrl(path);
	}

	private void configureSiteDomain() {
		try {
			final URL url = new URL(TEST_SITE);
			host = url.getHost();
			final String protocol = url.getProtocol();
			urlConsolidator = new UrlConsolidator(protocol + "://" + host + "/");
		} catch (MalformedURLException exc) {
			System.out.println(ExceptionUtils.getStackTrace(exc));
		}
	}

	private DefaultHttpClient createClient() {
		DefaultHttpClient client = new DefaultHttpClient();
		client.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 30000);
		client.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 60000);
		client.getParams().setParameter(ClientPNames.COOKIE_POLICY, CookiePolicy.BROWSER_COMPATIBILITY);

		if (proxy != null && proxyPort > 0) {
			HttpHost proxyHost = new HttpHost(proxy, proxyPort);
			HttpRoutePlanner routePlanner = new HttpRoutePlanner() {
				@Override
				public HttpRoute determineRoute(HttpHost target, HttpRequest request, HttpContext context)
						throws HttpException {
					return new HttpRoute(target, null, new HttpHost(proxy, proxyPort),
							"https".equalsIgnoreCase(target.getSchemeName()));
				}
			};
			client.getParams().setParameter(ConnRouteParams.DEFAULT_PROXY, proxyHost);
			client.setRoutePlanner(routePlanner);
		}

		return client;
	}

	private PageRequest get(final String url) {
		return new PageRequest().withMethod(HttpMethod.GET).withUrl(url);
	}

	private PageRequest post(final String url, final String entity) {
		return new PageRequest().withMethod(HttpMethod.POST).withEntity(entity).withUrl(url);
	}

	private final class HttpMethod {
		public static final String GET = "GET";
		public static final String POST = "POST";
	}

	private class PageRequest {
		private String url;
		private String entity;
		private String method;
		private String cookie;

		public String getUrl() {
			return url;
		}

		public String getEntity() {
			return entity;
		}

		public String getMethod() {
			return method;
		}

		public String getCookie() {
			return cookie;
		}

		public PageRequest withUrl(String url) {
			this.url = url;
			return this;
		}

		public PageRequest withEntity(String entity) {
			this.entity = entity;
			return this;
		}

		public PageRequest withMethod(String method) {
			this.method = method;
			return this;
		}

		public PageRequest withCookie(String cookie) {
			this.cookie = cookie;
			return this;
		}
	}

	private class PageResponse {
		private int statusCode;
		String content;
		private String location;
		private String setCookie;
		private boolean success;
		private boolean serverFailure;

		public int getStatusCode() {
			return statusCode;
		}

		public String getContent() {
			return content;
		}

		public String getLocation() {
			return location;
		}

		public String getSetCookie() {
			return setCookie;
		}

		public boolean isSuccess() {
			return success;
		}

		public boolean isServerFailure() {
			return serverFailure;
		}

		public void setStatusCode(int statusCode) {
			this.statusCode = statusCode;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public void setSetCookie(String setCookie) {
			this.setCookie = setCookie;
		}

		public void setSuccess(boolean success) {
			this.success = success;
		}

		public void setServerFailure(boolean serverFailure) {
			this.serverFailure = serverFailure;
		}
	}

	private boolean isSuccess(PageResponse response) {
		return response != null && response.isSuccess();
	}

	private PageRequest updateRequest(final PageResponse response, final PageRequest defaultRequest) {
		if (response != null && response.getLocation() != null) {
			return defaultRequest.withUrl(response.getLocation());
		}
		return defaultRequest;
	}

	private PageResponse send(final PageRequest request) throws Exception {
		PageResponse pageResponse = null;
		try {
			switch (request.getMethod()) {
			case HttpMethod.GET:
				HttpGet getRequest = createHttpGet(allowHttpRedirection(true), request);
				HttpResponse getResponse = httpClient.execute(getRequest, context());
				pageResponse = responseHandler.handleResponse(getResponse);
				break;
			case HttpMethod.POST:
				HttpPost postRequest = createHttpPost(allowHttpRedirection(true), request);
				HttpResponse postResponse = httpClient.execute(postRequest, context());
				pageResponse = responseHandler.handleResponse(postResponse);
				break;
			default:
				System.err.println("Method '" + request.getMethod() + "' is not supported!");
				break;
			}
		} catch (SocketTimeoutException exc) {
			System.out.println("WARN - Socket Time Out error" + withException(exc));
		} catch (SSLException exc) {
			System.out.println("WARN - SSL error" + withException(exc));
		} catch (ConnectionClosedException exc) {
			System.out.println("WARN - Connection prematurely closed" + withException(exc));
			pageResponse = new PageResponse();
			pageResponse.setServerFailure(true);
		} catch (SocketException exc) {
			throw new Exception("Socket error " + exc);
		} catch (Exception exc) {
			throw new Exception(exc);
		}
		if (pageResponse != null && pageResponse.isServerFailure()) {
			pause();
			reinitializeClient();
		}
		return pageResponse;
	}

	private HttpGet createHttpGet(HttpParams params, PageRequest request) {
		HttpGet httpGet = new HttpGet(request.getUrl());
		httpGet.addHeader("Accept", "*/*");
		httpGet.addHeader("Accept-Language", "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4"); 
		httpGet.addHeader("Connection", "keep-alive");
		if (StringUtils.isNotBlank(request.getCookie()))
			httpGet.addHeader("Cookie", request.getCookie());
		httpGet.addHeader("Host", host);
		httpGet.addHeader("User-Agent",
				"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.101 Safari/537.36");
		httpGet.setParams(params);
		return httpGet;
	}

	private HttpPost createHttpPost(HttpParams params, PageRequest request) throws UnsupportedEncodingException {
		HttpPost httpPost = new HttpPost(request.getUrl());
		httpPost.addHeader("Accept", "*/*");
		httpPost.addHeader("Accept-Language", "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4"); 
		httpPost.addHeader("Connection", "keep-alive");
		httpPost.addHeader("Content-Type", "application/json");
		if (StringUtils.isNotBlank(request.getCookie()))
			httpPost.addHeader("Cookie", request.getCookie());
		httpPost.addHeader("Host", host);
		httpPost.addHeader("User-Agent",
				"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.101 Safari/537.36");
		httpPost.addHeader("X-Requested-With", "XMLHttpRequest");
		httpPost.setEntity(new StringEntity(request.getEntity(), HTTP.UTF_8));
		httpPost.setParams(params);
		return httpPost;
	}

	private void pause() {
		long millis = (long) (Math.random() * 3000);
		try {
			Thread.sleep(millis);
		} catch (InterruptedException iexc) {
			System.err.println("Sleep error" + withException(iexc));
			Thread.currentThread().interrupt();
		}
	}

	private void reinitializeClient() {
		System.out.println("Reinitializing the client ...");
		closeClient(httpClient);
		httpClient = createClient();
	}

	private final ResponseHandler<PageResponse> responseHandler = new ResponseHandler<PageResponse>() {
		@Override
		public PageResponse handleResponse(HttpResponse httpResponse) throws IOException {
			PageResponse pageResponse = new PageResponse();
			pageResponse.setStatusCode(httpResponse.getStatusLine().getStatusCode());
			System.out.println("Status : " + pageResponse.getStatusCode());

			pageResponse.setSetCookie(getCookie(httpResponse.getHeaders("Set-Cookie")));
			System.out.println("Set-Cookie : " + pageResponse.getSetCookie());

			switch (pageResponse.getStatusCode()) {
			case 200: // Response OK
				String content = getContent(httpResponse);
				pageResponse.setSuccess(true);
				pageResponse.setContent(content);
				break;

			case 301:
			case 302: // Redirected URL
				String location = getLocation(httpResponse);
				pageResponse.setLocation(location);
				break;
			case 404: // Page not found
				EntityUtils.consume(httpResponse.getEntity());
				throw new SocketException("Page not found");
			case 201:
				content = getContent(httpResponse);
				pageResponse.setSuccess(true);
				pageResponse.setContent(content);
				location = getLocation(httpResponse);
				System.out.println("Redirection - " + location);
				pageResponse.setLocation(location);
				break;
			default:
				pageResponse.setServerFailure(true);
				break;
			}
			EntityUtils.consume(httpResponse.getEntity());
			return pageResponse;
		}

		private String getLocation(HttpResponse response) {
			Header locationHeader = response.getFirstHeader("Location");
			if (locationHeader != null) {
				String location = locationHeader.getValue();
				return cleanPath(location);
			}
			return null;
		}

		private String getContent(HttpResponse response) throws IOException {
			Header contentEncodingHeader = response.getFirstHeader("Content-Encoding");
			if (contentEncodingHeader != null && contentEncodingHeader.getValue().contains("gzip")) {
				return StringUtils.trim(
						IOUtils.toString(new GzipDecompressingEntity(response.getEntity()).getContent(), HTTP.UTF_8));
			}
			return StringUtils.trim(EntityUtils.toString(response.getEntity(), HTTP.UTF_8));
		}

		private String getCookie(Header... headers) {
			List<String> list = Lists.newArrayList();
			for (Header header : headers) {
				list.add(StringUtils.substringBefore(header.getValue(), ";"));
			}
			return Joiner.on("; ").skipNulls().join(list);
		}
	};

	private HttpContext context() {
		CookieStore cookieStore = httpClient.getCookieStore();
		HttpContext localContext = new BasicHttpContext();
		localContext.setAttribute(ClientContext.COOKIE_STORE, cookieStore);
		return localContext;
	}

	private PageResponse connection(final PageRequest request, final String type) {
		System.out.println("");
		System.out.println("-----------------------------");
		System.out.println("Connect on " + type + " url : " + request.getUrl());
		try {
			PageResponse response = send(request);
			if (isSuccess(response)) {
				return response;
			}
			PageRequest newRequest = updateRequest(response, request);
			response = send(newRequest);
			int i = 1;
			while (!isSuccess(response) && i < MAX_PAGE_RETRY_COUNT) {
				newRequest = updateRequest(response, newRequest);
				response = send(newRequest);
				i++;
			}
			return response;
		} catch (Exception exc) {
			System.out.println("Connection parse error. '" + exc + "'");
		} finally {
			closeClient(httpClient);
		}
		return null;
	}

	private HttpParams allowHttpRedirection(boolean redirection) {
		HttpParams params = new BasicHttpParams();
		params.setParameter(ClientPNames.HANDLE_REDIRECTS, redirection);
		params.setParameter(ClientPNames.ALLOW_CIRCULAR_REDIRECTS, false);
		return params;
	}

	private String withException(Exception exc) {
		return " - Exc : " + exc;
	}

	@Override
	public void sendGet() {
		PageRequest request = get(TEST_SITE);
		try {
			PageResponse testPage = connection(request, "user page");
			checkNotNull(testPage, "No testPage returned");
			System.out.println(testPage.content);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void sendPost(String requestEntity) {
		PageRequest request = post(TEST_SITE, requestEntity);
		try {
			PageResponse testPage = connection(request, "create some field page");
			checkNotNull(testPage, "No testPage returned");
			System.out.println(testPage.content);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private void closeClient(DefaultHttpClient httpClient) {
		if (httpClient != null) {
			try {
				httpClient.getConnectionManager().shutdown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private String requestEntity;

	public String getEntity() {
		return requestEntity;
	}

	public void setEntity(String requestEntity) {
		this.requestEntity = requestEntity;
	}
	
//	requestEntity is the request body itself
	public AbstractConnectionEngine withRequestEntity(String requestEntity){
		this.requestEntity = requestEntity;
		return this;
	}

	@Override
	public void sendPost() {
		PageRequest request = post(TEST_SITE, requestEntity);
		try {
			PageResponse testPage = connection(request, "create some field page");
			checkNotNull(testPage, "No testPage returned");
			System.out.println(testPage.content);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
