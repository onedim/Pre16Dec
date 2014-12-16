
public class Avion {

	private Paket[] paketi=new Paket[3];
	public Paket[]getPaket(){
		return paketi;
	}
	public double getUkupnaTezina() {
	double ukupno=0;
			
	for (Paket paketPrvi: paketi){
				ukupno +=paketPrvi.getTezina();
		
	}
	return ukupno;
}
}