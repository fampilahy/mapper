package tools;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.document.AbstractDocument;
import model.document.chubb.s6Transaction.Customer;

public class JsonTool {

	public static final ObjectMapper objectMapper = new ObjectMapper();

	
	
	
	public static JsonNode fromDocumentToJsonNode(Customer[] customers) {
		JsonNode jsonNode = null;
		if (customers == null) return null;
		try {
			jsonNode = objectMapper.readTree(objectMapper.writeValueAsString(customers));
		} catch (Exception e) {
			System.err.println("tools.JsonTool.fromDocumentToJsonNode() ==> "+e.getMessage());
		}
		return jsonNode;
	}
	
	
	public static JsonNode fromDocumentToJsonNode(AbstractDocument document) {
		JsonNode jsonNode = null;
		if (document == null) return null;
		try {
			jsonNode = objectMapper.readTree(objectMapper.writeValueAsString(document));
		} catch (Exception e) {
			System.err.println("tools.JsonTool.fromDocumentToJsonNode() ==> "+e.getMessage());
		}
		return jsonNode;
	}

	public static AbstractDocument fromJsonNodeToDocument(JsonNode jsonNode, AbstractDocument abstractDocument) {
		AbstractDocument document = null;
		try {
			document = objectMapper.readValue(objectMapper.writeValueAsString(jsonNode), abstractDocument.getClass());
		} catch (IOException e) {
			System.err.println("tools.JsonTool.fromJsonNodeToDocument() ==> "+e.getMessage());
		}
		return document;
	}

	public static AbstractDocument fromFileJsonNodeToDocument(String filePath, AbstractDocument abstractDocument) {
		AbstractDocument document = null;
		try {
			File file = new File(filePath);
			document = objectMapper.readValue(file, abstractDocument.getClass());
		} catch (IOException e) {
			System.err.println("tools.JsonTool.fromFileJsonNodeToDocument() ==> "+e.getMessage());
		}
		return document;
	}

}
