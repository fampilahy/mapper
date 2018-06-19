import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

import consumer.ConnectionEngine;
import mapper.AbstractMapper;
import mapper.AltaMapeador;
import model.document.AbstractDocument;
import model.document.chubb.ChubbDocument;
import model.document.chubb.ExampleDocument;
import model.document.chubb.messageByCategory.defaultValues.CountryCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValues.LanguageCodeFromChubb;
import model.document.chubb.messageByCategory.defaultValues.MessageCategoryCodeFromChubb;
import model.document.chubb.messageByCategory.request.GetMessagesByCategoryRequest;
import model.document.chubb.s6Transaction.request.ProcessTransactionRequest;
import model.document.chubb.splitInfo.request.GetSplitInfoRequest;
import model.document.sib21.SIB21Document;
import tools.JsonTool;
import tools.UrlConsolidator;

public class Main {

	private static final String BASE_URL = "http://localhost:8080/chubb/develop/";
	private static final UrlConsolidator URL_CONSOLIDATOR = new UrlConsolidator(BASE_URL);

	public static void main(String[] args) {

		// test from json to object
		// SIB21Document sibDocument = new SIB21Document();
		// sibDocument = (SIB21Document)
		// JsonTool.fromFileJsonNodeToDocument("src/test.json", sibDocument);
		// System.out.println("==> " + sibDocument.toString());
		// System.out.println(sibDocument.getAsegurado().getCodigoPostal());

		// System.out.println("HelloWorld");

		ConnectionEngine connectionEngine = new ConnectionEngine();
		// connectionEngine.setTEST_SITE("http://localhost:8080/chubb/getExternalWSCM");
		// connectionEngine.testGet();
		//
		// connectionEngine.setTEST_SITE("http://localhost:8080/chubb/getPremiumResponse");
		// connectionEngine.testGet();
		//
		// connectionEngine.setTEST_SITE("http://localhost:8080/chubb/getS6TransactionExternal");
		// connectionEngine.testGet();
		/**
		 * first test
		 **/
		String categoryCode = MessageCategoryCodeFromChubb.PAYMENT_METHOD.getCategoryCode();
		String countryCode = CountryCodeFromChubb.MEXICO.getMsgID();
		// String countryCode =
		// DefaultCountryCodeFromChubb.MEXICO.getCountryCode();
		Integer languageCode = LanguageCodeFromChubb.SPANISH.getKey();

		GetMessagesByCategoryRequest getMessagesByCategoryRequest = new GetMessagesByCategoryRequest();
		getMessagesByCategoryRequest.setCategoryCode(categoryCode);
		getMessagesByCategoryRequest.setCountryCode(countryCode);
		getMessagesByCategoryRequest.setLanguageCode(languageCode);
		JsonNode getMessagesByCategoryRequestJson = JsonTool.fromDocumentToJsonNode(getMessagesByCategoryRequest);

		connectionEngine = new ConnectionEngine();
		connectionEngine.setTEST_SITE(URL_CONSOLIDATOR
				.consolidateUrl(ProvidedDevelopChubbControllerUrl.COLLECT_MESSAGES_BY_CATEGORY_URL.getUrl()));
		connectionEngine.withRequestEntity(getMessagesByCategoryRequestJson.toString()).testPost();
		/**
		 * second test
		 **/
		// second step
//		Integer languageCode = LanguageCodeFromChubb.SPANISH.getKey();
//		Boolean loadBankInfo = true;
//		String splitKey = "MX18000102";
//
//		GetSplitInfoRequest getSplitInfoRequest = new GetSplitInfoRequest();
//		getSplitInfoRequest.setLanguageCode(languageCode);
//		getSplitInfoRequest.setLoadBankInfo(loadBankInfo);
//		getSplitInfoRequest.setSplitKey(splitKey);
//		JsonNode getSplitInfoRequestJson = JsonTool.fromDocumentToJsonNode(getSplitInfoRequest);
//		System.out.println(" getSplitInfoRequestJson "+getSplitInfoRequestJson.toString());
//
//		connectionEngine = new ConnectionEngine();
//		connectionEngine.setTEST_SITE(
//				URL_CONSOLIDATOR.consolidateUrl(ProvidedDevelopChubbControllerUrl.COLLECT_SPLIT_INFO_URL.getUrl()));
//		connectionEngine.withRequestEntity(getSplitInfoRequestJson.toString()).testPost();

		
//		example on how to process alta de usuario
		JsonNode jsonNode = null;// this is from Norma
		SIB21Document sib21Document = new SIB21Document();
		sib21Document = (SIB21Document) JsonTool.fromJsonNodeToDocument(jsonNode, sib21Document);
		AbstractMapper mapper = new AltaMapeador(sib21Document);
		ProcessTransactionRequest processTransactionRequest = mapper.convertSIB21DocumentToChubbDocument();
		JsonNode processTransactionRequestJson = JsonTool.fromDocumentToJsonNode(processTransactionRequest);
		connectionEngine = new ConnectionEngine();
		connectionEngine.setTEST_SITE(URL_CONSOLIDATOR
				.consolidateUrl(ProvidedDevelopChubbControllerUrl.PROCESS_TRANSACTION_URL.getUrl()));
		connectionEngine.withRequestEntity(processTransactionRequestJson.toString()).testPost();
		
	
	}

}
