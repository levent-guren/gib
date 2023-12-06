package ornek5;

public class Calistir {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Canli canli = new Canli();
		Bitki bitki = new Bitki();
		Agac agac = new Agac();
		Cicek cicek = new Cicek();
		Hayvan hayvan = new Hayvan();
		Kaplan kaplan = new Kaplan();

		deneyYap(bitki);
		deneyYap(agac);
		deneyYap(cicek);
//		deneyYap(canli); // hata veriyor
//		deneyYap(hayvan); // hata veriyor
//		deneyYap(kaplan); // hata veriyor
	}

	public static void deneyYap(Bitki bitki) {

	}
}
