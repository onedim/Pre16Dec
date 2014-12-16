
public class PaketArray {
	public static void main(String[] args) {
	
		DHLPaket[]paketi=new DHLPaket[3];
		
		for (int i=0;i<paketi.length;i++){
			paketi[i]=getPaket();
		}
		
		for (DHLPaket paketPrvi:paketi){
			System.out.println(paketPrvi);
		}

		
	}
		
	public static DHLPaket getPaket(){
		Paket paketPrvi=new Paket();{
			System.out.println("Unesite Tezinu paketa");
			paketPrvi.setTezina(TextIO.getDouble());
			
			System.out.println("Unesite Sirinu paketa");
			paketPrvi.setSirina(TextIO.getDouble());
			
			System.out.println("Unesite Visinu paketa");
			paketPrvi.setVisina(TextIO.getDouble());
			
			System.out.println("Unesite Duzinu paketa");
			paketPrvi.setDuzina(TextIO.getDouble());
			
			System.out.println("Cjena paketa: "+paketPrvi.getCijena());

			}
		return getPaket();
	}
	
	
		
	
}
