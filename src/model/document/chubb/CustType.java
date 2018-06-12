package model.document.chubb;

import java.util.HashMap;
import java.util.Map;

public class CustType extends ChubbDocument {

	// not a good way to develop codes, may use enum instead

	private String VALUE;
	private static Map MAP = new HashMap();

	// Constructor
	protected CustType(String value) {
		VALUE = value;
		MAP.put(VALUE, this);
	}

	public static final String STR_DP = "DP";
	public static final String STR_MI = "MI";
	public static final String STR_OT = "OT";
	public static final String STR_SP = "SP";
	public static final CustType DP = new CustType(STR_DP);
	public static final CustType MI = new CustType(STR_MI);
	public static final CustType OT = new CustType(STR_OT);
	public static final CustType SP = new CustType(STR_SP);

	public String getValue() {
		return VALUE;
	}

	public static CustType fromValue(String value) throws IllegalArgumentException {
		CustType enumeration = (CustType) MAP.get(value);
		if (enumeration == null)
			throw new IllegalArgumentException();
		return enumeration;
	}

	public static CustType fromString(String value) throws IllegalArgumentException {
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
	
	public CustType(){
		
	}

}
