package validator;

import model.document.AbstractDocument;

@FunctionalInterface
public interface DocumentValidator {
	public Validity validateDocument(AbstractDocument document);
}
