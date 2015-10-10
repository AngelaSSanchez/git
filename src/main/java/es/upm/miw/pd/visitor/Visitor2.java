package es.upm.miw.pd.visitor;

public class Visitor2 extends Visitor{

	private int elementA = 0;
	private int elementB = 0;
	
	@Override
	public void visitElementA(ElementA e) {
		elementA++;	
	}

	@Override
	public void visitElementB(ElementB e) {
		elementB++;		
	}
	
	public int getAs(){
		return this.elementA;
	}

	public int getBs(){
		return this.elementB;
	}
	
}
