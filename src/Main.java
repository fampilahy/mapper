import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

import consumer.MappingStarter;
import consumer.ProvidedDevelopChubbControllerUrl;
import consumer.ResponseSplitInfoDeserializer;
import consumer.connector.DefaultHttpClientConnectionEngine;
import mapper.AbstractMapper;
import mapper.SaleMapper;
import model.document.AbstractDocument;
import model.document.chubb.ChubbDocument;
import model.document.chubb.ExampleDocument;
import model.document.chubb.messageByCategory.defaultValues.CountryCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValues.LanguageCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValues.MessageCategoryCodeFromChubb;
import model.document.chubb.messageByCategory.request.GetMessagesByCategoryRequest;
import model.document.chubb.s6Transaction.request.ProcessTransactionRequest;
import model.document.chubb.splitInfo.defaultValues.ProductRelationSIB21Chubb;
import model.document.chubb.splitInfo.request.GetSplitInfoRequest;
import model.document.chubb.splitInfo.response.ResponseSplitInfo;
import model.document.sib21.SIB21Document;
import tools.JsonTool;
import tools.UrlConsolidator;
import java.util.UUID;

public class Main {

	private static final String BASE_URL = "http://localhost:8080/chubb/develop/";
	private static UrlConsolidator URL_CONSOLIDATOR = new UrlConsolidator(BASE_URL);

	public static void main(String[] args) {

		UUID uuid = UUID.randomUUID();

		String strUuid = uuid.toString();

		System.out.println("UIID " + strUuid);

		// test from json to object
		SIB21Document sib21Document = new SIB21Document();
		sib21Document = (SIB21Document) JsonTool.fromFileJsonNodeToDocument("src/resources/TestVidaPrime.json", sib21Document);
		 System.out.println("==> " + sib21Document);
		 System.out.println("from json ===>"+sib21Document.getServicio().toString());
		//
		// System.out.println("to json
		// ===>"+JsonTool.fromDocumentToJsonNode(sib21Document).toString());

		DefaultHttpClientConnectionEngine connectionEngine = new DefaultHttpClientConnectionEngine();

		// **

		// connectionEngine.setTEST_SITE("http://localhost:8080/chubb/getExternalWSCM");
		// connectionEngine.testGet()
		//
		// connectionEngine.setTEST_SITE("http://localhost:8080/chubb/getPremiumResponse");
		// connectionEngine.testGet();
		//
		// connectionEngine.setTEST_SITE("http://localhost:8080/chubb/getS6TransactionExternal");
		// connectionEngine.testGet();

		// String categoryCode =
		// MessageCategoryCodeFromChubb.COUNTRY_CODE.getCategoryCode();
		// String countryCode = CountryCodeFromChubb.MEXICO.getMsgID();
		// Integer languageCode = LanguageCodeFromChubb.SPANISH.getKey();
		//
		// GetMessagesByCategoryRequest getMessagesByCategoryRequest = new
		// GetMessagesByCategoryRequest();
		// getMessagesByCategoryRequest.setCategoryCode(categoryCode);
		// getMessagesByCategoryRequest.setCountryCode(countryCode);
		// getMessagesByCategoryRequest.setLanguageCode(languageCode);
		// JsonNode getMessagesByCategoryRequestJson =
		// JsonTool.fromDocumentToJsonNode(getMessagesByCategoryRequest);
		//
		// connectionEngine = new DefaultHttpClientConnectionEngine();
		// connectionEngine.setTEST_SITE(URL_CONSOLIDATOR
		// .consolidateUrl(ProvidedDevelopChubbControllerUrl.COLLECT_MESSAGES_BY_CATEGORY_URL.getUrl()));
		// connectionEngine.withRequestEntity(getMessagesByCategoryRequestJson.toString()).sendPost();

		// **
		// **
		// second step
		Integer languageCode = LanguageCodeFromChubb.ENGLISH.getKey();
		Boolean loadBankInfo = false;

		String[] splitKeys = { "MX18001201" };
		// String[] splitKeys = { "PE16003702"};
		// String[] splitKeys = { "MX18001101"};
		// String[] splitKeys = { "PE16003702", "MX18001101", "MX18001201",
		// "MX18003001", "MX18003101", "MX18003201" };

		// String splitKey = "PE16003702"; //unauthorized
		// splitKey = "MX18001101";
		// splitKey = "MX18001201";
		// splitKey = "MX18003001";
		// splitKey = "MX18003101";
		// splitKey = "MX18003201"; //todos en error 500

		for (String splitKey : splitKeys) {
			System.out.println("-----------------------------------------");
			System.out.println("");

			// Integer languageCode = LanguageCodeFromChubb.SPANISH.getKey();
			GetSplitInfoRequest getSplitInfoRequest = new GetSplitInfoRequest();
			getSplitInfoRequest.setLanguageCode(languageCode);
			getSplitInfoRequest.setLoadBankInfo(loadBankInfo);
			getSplitInfoRequest.setSplitKey(splitKey);
			JsonNode getSplitInfoRequestJson = JsonTool.fromDocumentToJsonNode(getSplitInfoRequest);
			System.out.println(" getSplitInfoRequestJson " + getSplitInfoRequestJson.toString());

			connectionEngine = new DefaultHttpClientConnectionEngine();
			connectionEngine.setTEST_SITE(
					URL_CONSOLIDATOR.consolidateUrl(ProvidedDevelopChubbControllerUrl.COLLECT_SPLIT_INFO_URL.getUrl()));
			connectionEngine.withRequestEntity(getSplitInfoRequestJson.toString()).sendPost();

		}

		// **/

		/**
		 * // example on how to process alta de usuario // JsonNode jsonNode =
		 * null;// this is from Norma // sib21Document = new SIB21Document(); //
		 * sib21Document = (SIB21Document)
		 * JsonTool.fromJsonNodeToDocument(jsonNode, sib21Document); //
		 * System.out.println("json ==>
		 * "+sib21Document.getServicio().getBitacoraProcedimientoEjecutado());
		 * 
		 * 
		 * AbstractMapper mapper = new SaleMapper(sib21Document);
		 * ProcessTransactionRequest processTransactionRequest =
		 * mapper.convertSIB21DocumentToChubbDocument();
		 * 
		 * 
		 * 
		 * 
		 * JsonNode processTransactionRequestJson =
		 * JsonTool.fromDocumentToJsonNode(processTransactionRequest);
		 * connectionEngine = new DefaultHttpClientConnectionEngine();
		 * connectionEngine.setTEST_SITE(URL_CONSOLIDATOR
		 * .consolidateUrl(ProvidedDevelopChubbControllerUrl.PROCESS_TRANSACTION_URL.getUrl()));
		 * connectionEngine.withRequestEntity(processTransactionRequestJson.toString()).sendPost();
		 * 
		 * //
		 */

		// check transaction status
		// String transactionId = "2395C948-AF35-4D25-939D-DAAC0DC2C8F2-12508";
		// connectionEngine = new DefaultHttpClientConnectionEngine();
		// connectionEngine.setTEST_SITE(URL_CONSOLIDATOR
		// .consolidateUrl(ProvidedDevelopChubbControllerUrl.GET_TRANSACTION_STATUS_URL.getUrl()).replace("{transactionId}",transactionId));
		// connectionEngine.sendGet();
		//

		// URL_CONSOLIDATOR = new UrlConsolidator("http://192.168.41.46:8080/");
		// JsonNode processMappingAndTransactionNode =
		// JsonTool.fromDocumentToJsonNode(sib21Document);
		// connectionEngine = new DefaultHttpClientConnectionEngine();
		// connectionEngine.setTEST_SITE(URL_CONSOLIDATOR
		// .consolidateUrl(ProvidedDevelopChubbControllerUrl.PROCESS_MAPPING_AND_TRANSACTION.getUrl()));
		// connectionEngine.withRequestEntity(processMappingAndTransactionNode.toString()).sendPost();
		//

		 MappingStarter mappingStarter = new MappingStarter();
		 mappingStarter.sendTransaction(sib21Document);

		// ResponseSplitInfoDeserializer responseSplitInfoDeserializer = new
		// ResponseSplitInfoDeserializer();
		// ProductRelationSIB21Chubb productRelationSIB21Chubb =
		// ProductRelationSIB21Chubb.ORO;
		//
		// ResponseSplitInfo responseSplitInfo =
		// responseSplitInfoDeserializer.getObject(productRelationSIB21Chubb.getChubbProductCode());
		// System.out.println("====>>
		// "+responseSplitInfo.getSplitInfo().toString());

	}

}
