package consumer.exception;

public class MainErrorException extends Exception {

	public MainErrorException(String str) {
		super(str);
	}

	public MainErrorException(Throwable throwable) {
		super(throwable);
	}

	public MainErrorException(String str, Throwable throwable) {
		super(str, throwable);
	}
}
