package model.document.chubb.s6Transaction;

import java.util.HashMap;
import java.util.Map;

import model.document.chubb.ChubbDocument;

public class CorrespondenceType extends ChubbDocument {

	// not a good way to develop codes, may use enum instead

	private String VALUE;
	private static Map<String, CorrespondenceType> MAP = new HashMap<String, CorrespondenceType>();

	protected CorrespondenceType(String value) {
		VALUE = value;
		MAP.put(VALUE, this);
	}

	public static final String STR_NONE = "None";
	public static final String STR_PRINT = "Print";
	public static final String STR_EMAIL = "Email";
	public static final CorrespondenceType NONE = new CorrespondenceType(STR_NONE);
	public static final CorrespondenceType PRINT = new CorrespondenceType(STR_PRINT);
	public static final CorrespondenceType EMAIL = new CorrespondenceType(STR_EMAIL);

	public String getValue() {
		return VALUE;
	}

	public static CorrespondenceType fromValue(String value) throws IllegalArgumentException {
		CorrespondenceType enumeration = (CorrespondenceType) MAP.get(value);
		if (enumeration == null)
			throw new IllegalArgumentException();
		return enumeration;
	}

	public static CorrespondenceType fromString(String value) throws IllegalArgumentException {
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
