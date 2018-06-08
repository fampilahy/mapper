package consumer;

import consumer.ConnectionEngine.PageResponse;

public abstract class AbstractConnectionEngine {

	protected abstract void test() ;

	protected abstract PageResponse connection(final PageRequest request, final String type) ;

}
