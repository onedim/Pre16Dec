
public class Paket {
	
	public double getSirina() {
		return sirina;
	}
	public void setSirina(double sirina) {
		this.sirina = sirina;
	}
	public double getVisina() {
		return visina;
	}
	public void setVisina(double visina) {
		this.visina = visina;
	}
	public double getDuzina() {
		return duzina;
	}
	public void setDuzina(double duzina) {
		this.duzina = duzina;
	}
	public double getTezina() {
		return tezina;
	}
	public void setTezina(double tezina) {
		this.tezina = tezina;
	}
	private double sirina;
	private double visina;
	private double duzina;
	private double tezina;
		
	/**
	 * izracunavanje cjene
	 * @param tezina
	 * @return
	 */
	public double getCijena(){
		return tezina*3;
		
		
	}
	
	public String toString(){
		return "Paket("+getTezina()+"x"+
				getSirina()+"x"+
				getVisina()+"x"+
				getVisina();
				
	}
	
	

}
