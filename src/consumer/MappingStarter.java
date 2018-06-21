package consumer;

import com.fasterxml.jackson.databind.JsonNode;

import consumer.connector.AbstractConnectionEngine;
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
	
	private SIB21Document sib21Document ;
	
	public MappingStarter(){
		
		boolean isModification = false; //TODO test with modification date, if modification date is available its a modif
		
		
		if(isModification){
			
		}else{//its a sale
			SaleMapper saleMapper = new SaleMapper(sib21Document);
//			SIB21Document sib21Document = new SIB21Document();
//			sib21Document = (SIB21Document) JsonTool.fromJsonNodeToDocument(jsonNode, sib21Document);
			
			ProcessTransactionRequest processTransactionRequest = saleMapper.convertSIB21DocumentToChubbDocument();
			JsonNode processTransactionRequestJson = JsonTool.fromDocumentToJsonNode(processTransactionRequest);
			AbstractConnectionEngine connectionEngine = new DefaultHttpClientConnectionEngine(URL_CONSOLIDATOR
					.consolidateUrl(ProvidedDevelopChubbControllerUrl.PROCESS_TRANSACTION_URL.getUrl()));
//			connectionEngine.setTEST_SITE(;
			((DefaultHttpClientConnectionEngine) connectionEngine).withRequestEntity(processTransactionRequestJson.toString()).sendPost();
		}
		
		
		
		
	}
	
	public initTansaction(SIB21Document sib21Document){
		
	}
	
    public MappingStarter(SIB21Document sib21Document){
		this.sib21Document = sib21Document;
	}

	public SIB21Document getSib21Document() {
		return sib21Document;
	}

	public void setSib21Document(SIB21Document sib21Document) {
		this.sib21Document = sib21Document;
	}

}
