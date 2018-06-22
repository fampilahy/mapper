import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

import consumer.MappingStarter;
import consumer.ProvidedDevelopChubbControllerUrl;
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
import model.document.chubb.splitInfo.request.GetSplitInfoRequest;
import model.document.sib21.SIB21Document;
import tools.JsonTool;
import tools.UrlConsolidator;

public class Main {

	private static final String BASE_URL = "http://localhost:8080/chubb/develop/";
	private static final UrlConsolidator URL_CONSOLIDATOR = new UrlConsolidator(BASE_URL);

	public static void main(String[] args) {

//		 test from json to object
		 SIB21Document sib21Document = new SIB21Document();
		 sib21Document = (SIB21Document) JsonTool.fromFileJsonNodeToDocument("src/resources/test.json", sib21Document);
		 System.out.println("==> " + sib21Document);
		 System.out.println("from json ===>"+sib21Document.getServicio().getBitacoraProcedimientoEjecutado());
		 
		 System.out.println("to json ===>"+JsonTool.fromDocumentToJsonNode(sib21Document).toString());
		 
		 
		 
		DefaultHttpClientConnectionEngine connectionEngine = new DefaultHttpClientConnectionEngine();
		
		/**

		
		// connectionEngine.setTEST_SITE("http://localhost:8080/chubb/getExternalWSCM");
		// connectionEngine.testGet();
		//
		// connectionEngine.setTEST_SITE("http://localhost:8080/chubb/getPremiumResponse");
		// connectionEngine.testGet();
		//
		// connectionEngine.setTEST_SITE("http://localhost:8080/chubb/getS6TransactionExternal");
		// connectionEngine.testGet();
	
	
	
		String categoryCode = MessageCategoryCodeFromChubb.COUNTRY_CODE.getCategoryCode();
		String countryCode = CountryCodeFromChubb.MEXICO.getMsgID();
		Integer languageCode = LanguageCodeFromChubb.SPANISH.getKey();

		GetMessagesByCategoryRequest getMessagesByCategoryRequest = new GetMessagesByCategoryRequest();
		getMessagesByCategoryRequest.setCategoryCode(categoryCode);
		getMessagesByCategoryRequest.setCountryCode(countryCode);
		getMessagesByCategoryRequest.setLanguageCode(languageCode);
		JsonNode getMessagesByCategoryRequestJson = JsonTool.fromDocumentToJsonNode(getMessagesByCategoryRequest);

		connectionEngine = new DefaultHttpClientConnectionEngine();
		connectionEngine.setTEST_SITE(URL_CONSOLIDATOR
				.consolidateUrl(ProvidedDevelopChubbControllerUrl.COLLECT_MESSAGES_BY_CATEGORY_URL.getUrl()));
		connectionEngine.withRequestEntity(getMessagesByCategoryRequestJson.toString()).sendPost();
		
		/**
		//**
		// second step
		Integer languageCode = LanguageCodeFromChubb.SPANISH.getKey();
		Boolean loadBankInfo = true;
		String splitKey = "PE16003702";
//		Integer languageCode = LanguageCodeFromChubb.SPANISH.getKey();
		GetSplitInfoRequest getSplitInfoRequest = new GetSplitInfoRequest();
		getSplitInfoRequest.setLanguageCode(languageCode);
		getSplitInfoRequest.setLoadBankInfo(loadBankInfo);
		getSplitInfoRequest.setSplitKey(splitKey);
		JsonNode getSplitInfoRequestJson = JsonTool.fromDocumentToJsonNode(getSplitInfoRequest);
		System.out.println(" getSplitInfoRequestJson "+getSplitInfoRequestJson.toString());

		connectionEngine = new DefaultHttpClientConnectionEngine();
		connectionEngine.setTEST_SITE(
				URL_CONSOLIDATOR.consolidateUrl(ProvidedDevelopChubbControllerUrl.COLLECT_SPLIT_INFO_URL.getUrl()));
		connectionEngine.withRequestEntity(getSplitInfoRequestJson.toString()).sendPost();
//**/
		
		/**
//		example on how to process alta de usuario
//		JsonNode jsonNode = null;// this is from Norma
//		 sib21Document = new SIB21Document();
//		sib21Document = (SIB21Document) JsonTool.fromJsonNodeToDocument(jsonNode, sib21Document);
//		System.out.println("json ==> "+sib21Document.getServicio().getBitacoraProcedimientoEjecutado());
		
		
		AbstractMapper mapper = new SaleMapper(sib21Document);
		ProcessTransactionRequest processTransactionRequest = mapper.convertSIB21DocumentToChubbDocument();
		
		
		
		
		JsonNode processTransactionRequestJson = JsonTool.fromDocumentToJsonNode(processTransactionRequest);
		connectionEngine = new DefaultHttpClientConnectionEngine();
		connectionEngine.setTEST_SITE(URL_CONSOLIDATOR
				.consolidateUrl(ProvidedDevelopChubbControllerUrl.PROCESS_TRANSACTION_URL.getUrl()));
		connectionEngine.withRequestEntity(processTransactionRequestJson.toString()).sendPost();
		
		//*/
		
		
		
		
		MappingStarter mappingStarter = new MappingStarter();
//		mappingStarter.setSib21Document(sib21Document);
		mappingStarter.sendTransaction(sib21Document);
		
	
	}

}
