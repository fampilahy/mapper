package validator;

import model.document.AbstractDocument;

public interface DocumentValidator {
	

	public Validity validateDocument(AbstractDocument document);

}
