
public class AvionPrompt {

	public static void main(String[] args) {
		Avion a=new Avion();
		Paket[]paketi=a.getPaket();
		
		for (int i = 0;i<paketi.length;i++){
			paketi[i]=getPaket();
		}
		for (Paket paketPrvi: paketi){
			System.out.println(paketPrvi);
		}
		}

	private static Paket getPaket() {
		Paket paketPrvi=new Paket();{
			System.out.println("Unesite Tezinu paketa");
			paketPrvi.setTezina(TextIO.getlnDouble());
			
			System.out.println("Unesite Sirinu paketa");
			paketPrvi.setSirina(TextIO.getlnDouble());
			
			System.out.println("Unesite Visinu paketa");
			paketPrvi.setVisina(TextIO.getlnDouble());
			
			System.out.println("Unesite Duzinu paketa");
			paketPrvi.setDuzina(TextIO.getlnDouble());
			
			System.out.println("Cjena paketa: "+paketPrvi.getCijena());

			}
		return paketPrvi;
	}
	
		
	

}
