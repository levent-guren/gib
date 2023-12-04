package deneme;

public class Ornek4 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		float f = 3.2f;
		double s = 5.81;
		char c = 'a';
		c = '\u0000';
		c = '\b'; // backspace
		c = '\t'; // tab
		c = '\n'; // new line
		boolean sonuc = false;

		if ((0.1 + 0.2) == 0.3) {
			System.out.println("Eşit");
		} else {
			System.out.println("Eşit değil");
		}
		int a = 3;
		a = a << 2;
		System.out.println(a);
		a = 3; // 11
		a = a >> 1;
		System.out.println(a);
		double p = 3;
		// p = p >> 1; // hata veriyor
		a = -3;
		a = a >> 1;
		System.out.println(a); // -2 en soldaki bitin sayının işareti olduğunu
								// gözeterek kaydırma yapıyor
		a = -3;
		a = a >>> 1;
		System.out.println(a); // 2147483646
		// en soldaki bitin anlamına bakmadan tüm bitleri kaydırır.
		int b = 3; // 000000011
		int b2 = 5;// 000000101
		int b3 = b & b2;
		System.out.println(b3);
		System.out.println(b | b2); // inclusive or 111
		System.out.println(b ^ b2); // exclusive or 110

	}
}
