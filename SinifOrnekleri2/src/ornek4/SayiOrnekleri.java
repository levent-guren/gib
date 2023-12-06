package ornek4;

import java.math.BigDecimal;

public class SayiOrnekleri {
	public static void main(String[] args) {
		BigDecimal sayi1 = new BigDecimal("2.3");
		BigDecimal sayi2 = new BigDecimal("8.2");
		BigDecimal sayi3 = new BigDecimal("1.12");
		BigDecimal sonuc = sayi1.multiply(sayi2);
		sonuc = sonuc.multiply(sayi3);
		System.out.println(sonuc);
	}
}
