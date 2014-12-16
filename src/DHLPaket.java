
public class DHLPaket extends Paket {
	
	public double getDimensionalWeight(){
		double dw=getSirina()*getVisina()*getDuzina()/5000;
		return dw;
		
		
	}
}
