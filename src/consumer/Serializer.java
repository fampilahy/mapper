package consumer;

public interface Serializer<T> {

	public Boolean saveObject(T t);

}
