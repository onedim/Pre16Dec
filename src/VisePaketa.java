
public class VisePaketa {

	public static void main(String[] args) {
		Paket p=new Paket();
		Paket[] paketi=new Paket[3];
		p=new Paket();
		paketi[1]=p;
		
		p=new Paket();
		paketi[2]=p;
		
		p=null;
		paketi=null;

	}

}
