package tools;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.document.AbstractDocument;
import model.document.chubb.ChubbDocument;

public class JsonTool {
	
	public static JsonNode fromDocumentToJsonNode(AbstractDocument document){
		JsonNode jsonNode = null;
		if(document == null) return null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			jsonNode = objectMapper.readTree(objectMapper.writeValueAsString(document));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonNode;
	}
	
	public static AbstractDocument fromJsonNodeToDocument(JsonNode jsonNode, ChubbDocument chubbDocument){
//		chubbDocument.getClass();
		return null;
		
	}
	
	
}
	
