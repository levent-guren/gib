package deneme;

public class Ornek8 {
	public static void main(String[] args) {
		String adi = new String("Mehmet");
		String adi2 = new String("Mehmet");
		if (adi == adi2) {
			System.out.println("Eşit");
		} else {
			System.out.println("Eşit değil");
		}

		if (adi.equals(adi2)) {
			System.out.println("Eşit içerikli");
		} else {
			System.out.println("Eşit içerikli değil");
		}
		System.out.println("----------------------------");
		adi = "Mehmet";
		adi2 = "Mehmet";
		if (adi == adi2) {
			System.out.println("Eşit");
		} else {
			System.out.println("Eşit değil");
		}

		if ("Ahmet".equals(adi)) {
			// adi değişkeninin değeri Ahmet mi diye bakılıyor.
			// adi değişkeninin null olması durumunda hata vermiyor.
		}
		if (adi.equals("Ahmet")) {
			// Burada da adi değişkeninin değeri Ahmet mi diye bakılıyor ancak
			// adi değişkeninin null olması durumunda hata veriyor.
		}

	}
}
