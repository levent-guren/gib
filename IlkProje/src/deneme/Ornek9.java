package deneme;

import java.util.Arrays;

public class Ornek9 {
	public static void main(String[] args) {
		int[] sayilar = new int[5];
		sayilar[1] = 3;
		System.out.println(sayilar[0]);
		System.out.println(sayilar);

		for (int i = 0; i < sayilar.length; i++) {
			System.out.println(sayilar[i]);
		}
		System.out.println("------------------");
		for (int sayi : sayilar) { // foreach döngüsü
			System.out.println(sayi);
		}
		System.out.println("------------------");
		Arrays.stream(sayilar).forEach(System.out::println);
	}
}
