package consumer;

//import consumer.ConnectionEngine.PageResponse;

public abstract class AbstractConnectionEngine {

	public abstract void testGet() ;

	public abstract void testPost(String strRequestEntity) ;
//	protected abstract PageResponse connection(final PageRequest request, final String type) ;

}
