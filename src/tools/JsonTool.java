package tools;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.document.AbstractDocument;

public class JsonTool {

	public static final ObjectMapper objectMapper = new ObjectMapper();

	public static JsonNode fromDocumentToJsonNode(AbstractDocument document) {
		JsonNode jsonNode = null;
		if (document == null)
			return null;
		try {
			jsonNode = objectMapper.readTree(objectMapper.writeValueAsString(document));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonNode;
	}

	public static AbstractDocument fromJsonNodeToDocument(JsonNode jsonNode, AbstractDocument abstractDocument) {
		AbstractDocument document = null;
		try {
			document = objectMapper.readValue(objectMapper.writeValueAsString(jsonNode), abstractDocument.getClass());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return document;
	}

	public static AbstractDocument fromFileJsonNodeToDocument(String filePath, AbstractDocument abstracDocument) {
		AbstractDocument document = null;
		try {
			File file = new File(filePath);
			document = objectMapper.readValue(file, abstracDocument.getClass());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return document;
	}

}
