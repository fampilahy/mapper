package model.document.chubb.s6transaction.response;

import java.util.HashMap;
import java.util.Map;
import model.document.chubb.ChubbDocument;

public class S6TransactionStatus extends ChubbDocument {

	private String VALUE;
	private static Map MAP = new HashMap();

	// Constructor
	protected S6TransactionStatus(String value) {
		VALUE = value;
		MAP.put(VALUE, this);
	}

	public static final String STR_INQUEUE = "INQUEUE";
	public static final String STR_PROCESSING = "PROCESSING";
	public static final String STR_PROCESSED_OK = "PROCESSED_OK";
	public static final String STR_PROCESSED_ERROR = "PROCESSED_ERROR";
	public static final S6TransactionStatus IN_QUEUE = new S6TransactionStatus(STR_INQUEUE);
	public static final S6TransactionStatus PROCESSING = new S6TransactionStatus(STR_PROCESSING);
	public static final S6TransactionStatus PROCESSED_OK = new S6TransactionStatus(STR_PROCESSED_OK);
	public static final S6TransactionStatus PROCESSED_ERROR = new S6TransactionStatus(STR_PROCESSED_ERROR);

	public String getValue() {
		return VALUE;
	}

	public static S6TransactionStatus fromValue(String value) throws IllegalArgumentException {
		S6TransactionStatus enumeration = (S6TransactionStatus) MAP.get(value);
		if (enumeration == null)
			throw new IllegalArgumentException();
		return enumeration;
	}

	public static S6TransactionStatus fromString(String value) throws IllegalArgumentException {
		return fromValue(value);
	}

	public boolean equals(Object obj) {
		return (obj == this);
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public String toString() {
		return VALUE;
	}

	public Object readResolve() throws java.io.ObjectStreamException {
		return fromValue(VALUE);
	}

}
