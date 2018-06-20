package consumer;

//import consumer.ConnectionEngine.PageResponse;

public abstract class AbstractConnectionEngine {

	public abstract void sendGet() ;

	public abstract void sendPost(String strRequestEntity) ;
//	protected abstract PageResponse connection(final PageRequest request, final String type) ;


	public abstract void sendPost();

}
