package consumer;

import java.util.HashMap;
import java.util.Map;

import model.document.chubb.splitInfo.response.ResponseSplitInfo;
import tools.JsonTool;

public class ResponseSplitInfoDeserializer extends AbstractDeserializer<ResponseSplitInfo> {

	private static final String DIRECTORY = "src" + PATH_SEPARATOR + "resources";
	private static final String FILE_EXTENSION = ".json";

	// this is a subject of memory usage, would implement a way to free up
	// memory next time anyway the objects used are not too voluminous
	private static final Map<String, ResponseSplitInfo> responsesSplitInfo = new HashMap<String, ResponseSplitInfo>();

	private static ResponseSplitInfo getValue(String key) {
		if (responsesSplitInfo.containsKey(key)) {
			return responsesSplitInfo.get(key);
		} else
			return null;
	}

	@Override
	public ResponseSplitInfo getObject(String key) {
		if (key == null || key.equals(""))
			return null;
		ResponseSplitInfo responseSplitInfo = getValue(key);
		return responseSplitInfo != null ? responseSplitInfo : buildObject(key);

	}

	private ResponseSplitInfo buildObject(String key) {
		insetObjectFromFileToMemory(key,buildFilePath(key));
		return responsesSplitInfo.get(key);
	}

	private static void insetObjectFromFileToMemory(String key, String filePath) {
		if (key == null || key.equals("") || responsesSplitInfo.containsKey(key))
			return;
		ResponseSplitInfo responseSplitInfo = new ResponseSplitInfo();
		responseSplitInfo = (ResponseSplitInfo) JsonTool.fromFileJsonNodeToDocument(filePath, responseSplitInfo);
		if (responseSplitInfo != null)
			responsesSplitInfo.put(key, responseSplitInfo);
	}

	private static String buildFilePath(String key) {
		return (key == null || key.equals("")) ? null : DIRECTORY + PATH_SEPARATOR + key + FILE_EXTENSION;
	}

}
