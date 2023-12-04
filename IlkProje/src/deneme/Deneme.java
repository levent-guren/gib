package deneme;

public class Deneme {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Merhaba");
		byte a = 3;
		short b = 5;
		int c = 6;
		long d = 18326547321L;
		long e = 18_326_547_321L;

		System.out.println(c);

		c = 0250; // 0 ile başladığından 8'lik düzen
					// olarak yorumlanıyor.
					// 2*(8*8) + 5 * (8) + 0 * (1)
		System.out.println(c);

		c = 0xFF; // f=>15, 15*(16) + 15 * (1) = 255
		System.out.println(c);

		c = 0b11;
		System.out.println(c);

		c = 0b11111111;
		System.out.println(c);

		// dört işlem: + - * /
		// % kalanı veriyor

		c = 10 % 3;
		System.out.println(c);

		c = 3;
		c += 4;

		c = 2;
		c += c + 1;
		System.out.println(c);

		// ++ -- , değişkenin değerini 1 arttırır ya da
		// 1 azaltır

		c = 5;
		c++; // c 6 oluyor

		System.out.println("-------------------");

		b = 3;
		c = ++b * 2;
		System.out.println("b= " + b);
		System.out.println("c= " + c);

		System.out.println("-------------------");

		c = 3;
		c = ++c * 2;
		System.out.println("c= " + c);

		System.out.println("-------------------");

		c = 7;
		c = c++;
		System.out.println("c= " + c);

		System.out.println("-------------------");

		b = 4;
		c = ++b * b++ + b;

		System.out.println("b= " + b);
		System.out.println("c= " + c);
	}
}
