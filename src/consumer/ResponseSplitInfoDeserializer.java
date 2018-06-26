package consumer;

import java.util.HashMap;
import java.util.Map;

import model.document.chubb.splitInfo.response.ResponseSplitInfo;

public class ResponseSplitInfoDeserializer extends AbstractDeserializer<ResponseSplitInfo> {

	private static final String DIRECTORY = "src";
	private static final String PATH_SEPARATOR = "/";
	private static final String FILE_EXTENSION = ".json";

	// this is a subject of memory usage, would implement a way to free up
	// memory next time anyway the objects used are not too voluminous
	public static final Map<String, ResponseSplitInfo> responsesSplitInfo = new HashMap<String, ResponseSplitInfo>();

	@Override
	public ResponseSplitInfo getObject(String key) {

		if (key == null || key.equals(""))
			return null;
		ResponseSplitInfo responseSplitInfo = null;
		if (responsesSplitInfo.containsKey(key)) {
			return responsesSplitInfo.get(key);
		} else {

			// process check on db or on file
		}
		return responseSplitInfo;

	}

	private static void insetObjectToMemory(String key) {
		if (key == null)
			return;

	}

	private static String pathBuilder(String key) {
		return (key == null || key.equals("")) ? null : null;
	}

}
