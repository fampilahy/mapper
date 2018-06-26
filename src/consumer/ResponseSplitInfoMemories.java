package consumer;

import java.util.HashMap;
import java.util.Map;

import model.document.chubb.splitInfo.response.ResponseSplitInfo;

public class ResponseSplitInfoMemories {

	// this class might be subject to split info request to chubb service next
	// time
	
	//this is a subject of memory usage, would implement a way to free up memory next time anyway the objects used are not too voluminous
	public static final Map<String, ResponseSplitInfo> responseSplitInfos = new HashMap<String, ResponseSplitInfo>();

	public static ResponseSplitInfo getResponseSplitInfo(String key) {
		if (key==null || key.equals("")) return null;
		ResponseSplitInfo responseSplitInfo = null;
		if(responseSplitInfos.containsKey(key)){
			return responseSplitInfos.get(key);
		}
		return responseSplitInfo;
	}
	
	
	

}
