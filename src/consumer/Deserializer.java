package consumer;

@FunctionalInterface
public interface Deserializer<T> {

	public T getObject(String key);

}
