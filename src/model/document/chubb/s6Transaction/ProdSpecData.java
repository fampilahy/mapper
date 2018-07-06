package model.document.chubb.s6Transaction;

import model.document.chubb.ChubbDocument;

public class ProdSpecData extends ChubbDocument {

	private Integer indexer=0;

	private ProdSpecDataInfo[] prodsSpecDataInfo={new ProdSpecDataInfo()};

	public ProdSpecData() {
	}

	public ProdSpecData(Integer indexer, ProdSpecDataInfo[] prodsSpecDataInfo) {
		this.indexer = indexer;
		this.prodsSpecDataInfo = prodsSpecDataInfo;
	}

	public Integer getIndexer() {
		return indexer;
	}

	public void setIndexer(Integer indexer) {
		this.indexer = indexer;
	}

	public ProdSpecDataInfo[] getProdsSpecDataInfo() {
		return prodsSpecDataInfo;
	}

	public void setProdsSpecDataInfo(ProdSpecDataInfo[] prodsSpecDataInfo) {
		this.prodsSpecDataInfo = prodsSpecDataInfo;
	}

}
