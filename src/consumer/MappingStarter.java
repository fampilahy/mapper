package consumer;

import com.fasterxml.jackson.databind.JsonNode;
import consumer.connector.DefaultHttpClientConnectionEngine;
import mapper.SaleMapper;
import model.document.chubb.s6Transaction.request.ProcessTransactionRequest;
import model.document.sib21.SIB21Document;
import tools.JsonTool;
import tools.UrlConsolidator;

//could be the controller in the micro sercvice if ever needed

public class MappingStarter {

	private static final String CHUBB_ENDPOINT_BASE_URL = "http://localhost:8080/chubb/develop/";
	private static final UrlConsolidator URL_CONSOLIDATOR = new UrlConsolidator(CHUBB_ENDPOINT_BASE_URL);

	public MappingStarter() {

	}

	public String sendTransaction(SIB21Document sib21Document) {
		ProcessTransactionRequest processTransactionRequest = null;
		boolean isModification = false; // TODO test with modification date, if
										// modification date is available its a
										// modif

		if (isModification) {
			System.out.println("this is a modification");
			// TODO modification

		} else if (isModification) {
			System.out.println("this is a cancelation");
			// TODO cancelation

		} else {// TODO continue sale

			System.out.println("this is a sale");
			SaleMapper saleMapper = new SaleMapper(sib21Document);

			// SIB21Document sib21Document = new SIB21Document();
			// sib21Document = (SIB21Document)
			// JsonTool.fromJsonNodeToDocument(jsonNode, sib21Document);

			processTransactionRequest = saleMapper.convertSIB21DocumentToChubbDocument();

		}

		JsonNode processTransactionRequestJson = JsonTool.fromDocumentToJsonNode(processTransactionRequest);
		System.out.println("======> "+processTransactionRequestJson);
		DefaultHttpClientConnectionEngine defaultHttpClientConnectionEngine = new DefaultHttpClientConnectionEngine();
		defaultHttpClientConnectionEngine.setTEST_SITE(
				URL_CONSOLIDATOR.consolidateUrl(ProvidedDevelopChubbControllerUrl.PROCESS_TRANSACTION_URL.getUrl()));
		defaultHttpClientConnectionEngine.withRequestEntity(processTransactionRequestJson.toString()).sendPost();

		// defaultHttpClientConnectionEngine.withRequestEntity(processTransactionRequestJson.toString()).sendPost();

		// TODO test on success
		return "SUCCESS";
	}

}
