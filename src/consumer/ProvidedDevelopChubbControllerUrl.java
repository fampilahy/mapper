package consumer;


public enum ProvidedDevelopChubbControllerUrl {
	
	COLLECT_MESSAGES_BY_CATEGORY_URL ("collectMessagesByCategory"),
	COLLECT_PREMIUM_INFO_URL ("collectPremiumResponse"),
	COLLECT_SPLIT_INFO_URL ("collectSplitInfo"),
	PROCESS_TRANSACTION_URL ("processTransaction"),
	GET_TRANSACTION_STATUS_URL ("getTransactionStatus/{transactionId}"),
	PROCESS_MAPPING_AND_TRANSACTION ("processMappingAndTransaction");

	private ProvidedDevelopChubbControllerUrl( String url) {
		this.url = url;
	}

	private String url;

	public String getUrl() {
		return this.url;
	}

	
	

}
