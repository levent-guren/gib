package deneme;

public class Ornek10 {
	public static void main(String[] args) {
		String[] isimler = new String[4];
		System.out.println(isimler[0]); // null yazıyor
		isimler[1] = "Ahmet";
		isimler[2] = "Ayşe";
		isimler[3] = isimler[1];
		isimler[1] = "Fatma";
		isimler[2] = "Kazım"; // Ayşe String objesi hafızadan otomatik olarak
								// silinir. (Bir süre sonra boşta kaldığında
								// Garbage Collector tarafından)
		System.gc(); // kullanılması debug amacı dışında tavsiye edilmiyor.
		for (String isim : isimler) {
			System.out.println(isim);
		}
	}
}
