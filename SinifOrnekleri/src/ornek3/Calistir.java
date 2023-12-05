package ornek3;

public class Calistir {
	public static void main(String[] args) {
		Cocuk cocuk1 = new Cocuk();
		cocuk1.adi = "Perihan";
		Cocuk cocuk2 = new Cocuk();
		cocuk2.adi = "Buğra";
		Anne anne = new Anne();
		anne.adi = "Makbule";
		anne.cocuk = cocuk2;
		System.out.println(anne.cocuk.adi);
		anne.terlikAt();
		System.out.println(cocuk1.yaz());
		System.out.println(cocuk2.yaz());
	}
}
