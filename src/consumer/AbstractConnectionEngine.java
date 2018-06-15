package consumer;

import static com.google.common.base.Preconditions.checkNotNull;

import consumer.ConnectionEngine.PageRequest;
import consumer.ConnectionEngine.PageResponse;

//import consumer.ConnectionEngine.PageResponse;

public abstract class AbstractConnectionEngine {

	public abstract void testGet() ;

	public abstract void testPost(String strRequestEntity) ;
//	protected abstract PageResponse connection(final PageRequest request, final String type) ;


	public abstract void testPost();

}
