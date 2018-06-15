import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

import consumer.ConnectionEngine;
import model.document.AbstractDocument;
import model.document.chubb.ChubbDocument;
import model.document.chubb.ExampleDocument;
import model.document.chubb.messageByCategory.defaultValue.DefaultCountryCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValue.DefaultLanguageCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValue.MessageCategoryCodeFromChubb;
import model.document.chubb.messageByCategory.request.GetMessagesByCategoryRequest;
import model.document.sib21.SIB21Document;
import tools.JsonTool;
import tools.UrlConsolidator;

public class Main {

	private static final String BASE_URL = "http://localhost:8080/chubb/develop/";
	private static final UrlConsolidator URL_CONSOLIDATOR = new UrlConsolidator(BASE_URL);

	public static void main(String[] args) {

		// test from json to object
		SIB21Document sibDocument = new SIB21Document();
		sibDocument = (SIB21Document) JsonTool.fromFileJsonNodeToDocument("src/test.json", sibDocument);
		System.out.println("==> " + sibDocument.toString());
		System.out.println(sibDocument.getAsegurado().getCodigoPostal());

		// TODO Transaction object call

		// System.out.println("HelloWorld");

		// String TEST_SITE = "http://localhost:9595/users";
		// String TEST_SITE = "http://localhost:8080/chubb/getExternalWSCM";
		// private static final String TEST_SITE =
		// "http://localhost:9595/users/1";
		// private static final String TEST_SITE =
		// "http://localhost:8080/chubb/getS6TransactionExternale";

		// ConnectionEngine connectionEngine = new ConnectionEngine();
		// connectionEngine.setTEST_SITE(TEST_SITE);
		// connectionEngine.testGet();

		// TEST_SITE = "http://localhost:9595/users/2";
		// connectionEngine.setTEST_SITE(TEST_SITE);
		// connectionEngine.testGet();

		// connectionEngine.setTEST_SITE("http://localhost:8080/chubb/getExternalWSCM");
		// connectionEngine.testGet();
		//
		// connectionEngine.setTEST_SITE("http://localhost:8080/chubb/getPremiumResponse");
		// connectionEngine.testGet();
		//
		// connectionEngine.setTEST_SITE("http://localhost:8080/chubb/getS6TransactionExternal");
		// connectionEngine.testGet();
		//
		// connectionEngine.setTEST_SITE("http://localhost:8080/ejemplos/1");
		// connectionEngine.testGet();

		// TEST_SITE = "http://localhost:9595/users";
		// connectionEngine = new ConnectionEngine();
		// connectionEngine.setTEST_SITE(TEST_SITE);
		// connectionEngine.testPost("{\"name\":\"holi\",\"pass\":\"cc\",\"salary\":5000}");

		// TEST_SITE = "http://localhost:9595/users";
		// connectionEngine = new ConnectionEngine();
		// connectionEngine.setTEST_SITE(TEST_SITE);
		// connectionEngine.testGet();
		//

		// first test
		String categoryCode = MessageCategoryCodeFromChubb.PROVINCE_CODE.getCategoryCode();
		String countryCode = DefaultCountryCodeFromChubb.ARGENTINA.getCountryCode();
//		String countryCode = DefaultCountryCodeFromChubb.MEXICO.getCountryCode();
		Integer languageCode = DefaultLanguageCodeFromChubb.SPANISH.getLanguageCode();

		GetMessagesByCategoryRequest getMessagesByCategoryRequest = new GetMessagesByCategoryRequest();
		getMessagesByCategoryRequest.setCategoryCode(categoryCode);
		getMessagesByCategoryRequest.setCountryCode(countryCode);
		getMessagesByCategoryRequest.setLanguageCode(languageCode);
		JsonNode getMessagesByCategoryRequestJson = JsonTool.fromDocumentToJsonNode(getMessagesByCategoryRequest);

		ConnectionEngine connectionEngine = new ConnectionEngine();
		connectionEngine.setTEST_SITE(URL_CONSOLIDATOR
				.consolidateUrl(ProvidedDevelopChubbControllerUrl.COLLECT_MESSAGES_BY_CATEGORY_URL.getUrl()));
		connectionEngine.testPost(getMessagesByCategoryRequestJson.toString());

	}

}
