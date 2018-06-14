package model.document.chubb.premiumcalculator;

import java.util.HashMap;
import java.util.Map;

public class CustomerType {

	private String VALUE;
	private static Map TABLE = new HashMap();

	// Constructor
	protected CustomerType(String value) {
		VALUE = value;
		TABLE.put(VALUE, this);
	}

	public static final String STR_POLICY_HOLDER = "PolicyHolder";
	public static final String STR_SPOUSE = "Spouse";
	public static final String STR_DEPENDENT = "Dependent";
	public static final CustomerType PolicyHolder = new CustomerType(STR_POLICY_HOLDER);
	public static final CustomerType Spouse = new CustomerType(STR_SPOUSE);
	public static final CustomerType Dependent = new CustomerType(STR_DEPENDENT);

	public String getValue() {
		return VALUE;
	}

	public static CustomerType fromValue(String value) throws IllegalArgumentException {
		CustomerType enumeration = (CustomerType) TABLE.get(value);
		if (enumeration == null)
			throw new IllegalArgumentException();
		return enumeration;
	}

	public static CustomerType fromString(String value) throws IllegalArgumentException {
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
