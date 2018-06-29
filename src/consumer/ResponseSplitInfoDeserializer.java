package consumer;

import java.util.HashMap;
import java.util.Map;

import model.document.chubb.splitInfo.response.ResponseSplitInfo;
import tools.JsonTool;

public class ResponseSplitInfoDeserializer extends AbstractDeserializer<ResponseSplitInfo> {

	private static final String DIRECTORY = "src" + PATH_SEPARATOR + "resources";
	private static final String FILE_EXTENSION = ".json";
	private static final int DEFAULT_MAX_RESPONSE_SPLIT_INFO_INSTANCE_IN_MEMORY=50;

	// this is a subject of memory usage, would implement a way to free up
	// memory next time anyway the objects used are not too voluminous
	private static final Map<String, ResponseSplitInfo> responsesSplitInfo = new HashMap<String, ResponseSplitInfo>();

	private static ResponseSplitInfo getValue(String key) {
		return key==null||key.equals("")?null:responsesSplitInfo.containsKey(key)?responsesSplitInfo.get(key):null;
	}

	@Override
	public synchronized ResponseSplitInfo getObject(String key) {
		memoryUsageChecker();
		ResponseSplitInfo responseSplitInfo = getValue(key);
		return responseSplitInfo != null ? responseSplitInfo : buildObject(key);
	}

	private ResponseSplitInfo buildObject(String key) {
		insetObjectFromFileToMemory(key,buildFilePath(key));
		return getValue(key);
	}

	private static void insetObjectFromFileToMemory(String key, String filePath) {
		if (filePath==null||key == null || key.equals("") || responsesSplitInfo.containsKey(key))
			return;
		ResponseSplitInfo responseSplitInfo = new ResponseSplitInfo();
		responseSplitInfo = (ResponseSplitInfo) JsonTool.fromFileJsonNodeToDocument(filePath, responseSplitInfo);
		if (responseSplitInfo != null)
			responsesSplitInfo.put(key, responseSplitInfo);
	}

	private static String buildFilePath(String key) {
		return (key == null || key.equals("")) ? null : DIRECTORY + PATH_SEPARATOR + key + FILE_EXTENSION;
	}
	
	private static void memoryUsageChecker(){
		if(responsesSplitInfo!=null && responsesSplitInfo.size()==DEFAULT_MAX_RESPONSE_SPLIT_INFO_INSTANCE_IN_MEMORY)
			responsesSplitInfo.clear();
	}

}
