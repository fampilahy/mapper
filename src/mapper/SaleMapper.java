package mapper;

import model.document.chubb.s6Transaction.request.ProcessTransactionRequest;
import model.document.chubb.splitInfo.defaultValues.ProductRelationSIB21Chubb;
import model.document.sib21.SIB21Document;

public class SaleMapper extends AbstractMapper {

	private static final String SIB21_GASTOS_FUNERARIOS_NUMERO_DE_PRODUCTO = "16";
	private static final String SIB21_TARJETA_MAS_NUMERO_DE_PRODUCTO = "";
	private static final String SIB21_VIDA_PLUS_NUMERO_DE_PRODUCTO = "18";
	private static final String SIB21_VIDA_PRIME_NUMERO_DE_PRODUCTO = "22";
	private static final String SIB21_FRAUDE_Y_CLONATION_NUMERO_DE_PRODUCTO = "13";
	private static final String SIB21_SEGURO_HOGAR_NUMERO_DE_PRODUCTO = "14";
	private static final String SIB21_SEGURO_ACCIDENTES_NUMERO_DE_PRODUCTO = "12";
	private static final String SIB21_FRAUDE_Y_CLONATION_NUMERO_DE_PRODUCTO_2 = "13";
	private static final String SIB21_VIDA_PLUS_ORO_NUMERO_DE_PAQUETE = "01";
	private static final String SIB21_VIDA_PLUS_PLATA_NUMERO_DE_PAQUETE = "02";
	private static final String SIB21_VIDA_PLUS_BRONZE_NUMERO_DE_PAQUETE = "03";
	private static final String SIB21_VIDA_PRIME_ORO_NUMERO_DE_PAQUETE = "01";
	private static final String SIB21_VIDA_PRIME_PLATA_NUMERO_DE_PAQUETE = "02";
	private static final String SIB21_VIDA_PRIME_BRONZE_NUMERO_DE_PAQUETE = "03";
	
	public SaleMapper(SIB21Document sib21Document) {
		this.sib21Document = sib21Document;
	}

	@Override
	public ProcessTransactionRequest convertSIB21DocumentToChubbDocument() {
		return Converter.processDefaultConversionSIB21DocumentToChubbDocument(sib21Document,
				this.transactionTypeCodeFromChubb, getProductRelationSIB21Chubb(sib21Document));
	}

	public ProductRelationSIB21Chubb getProductRelationSIB21Chubb(SIB21Document sib21Document) {
		if(sib21Document==null || sib21Document.getServicio()==null||sib21Document.getServicio().getTmp_NumPro()==null||sib21Document.getServicio().getTmp_NumPro().equals("")) return null;
		
		ProductRelationSIB21Chubb productRelationSIB21Chubb = null;
		
		
		switch(sib21Document.getServicio().getTmp_NumPro()){
		
		case SIB21_VIDA_PLUS_NUMERO_DE_PRODUCTO : int a = 0;break;
		case SIB21_VIDA_PRIME_NUMERO_DE_PRODUCTO :  ;break;
		
		
		}
		
		
//		switch (a){
//		ProductRelationSIB21Chubb productRelationSIB21Chubb;
//		case " " : productRelationSIB21Chubb = ProductRelationSIB21Chubb.BRONZE; break;
//		
//		}
		
		
		return productRelationSIB21Chubb; // TODO for now we just implement
												// ORO for test then we will add
												// accordingly to time;
	}
	
	
	
	//implementing the others
	
	
	
	

}
