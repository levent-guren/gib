package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calistir7 {
	public static void main(String[] args) {
		// try, blok sonunda tanımladığımız scanner sınıfının close metodunu
		// otomatik olarak çağırıyor.
		try (Scanner scanner = new Scanner(System.in)) {
			List<Integer> sayilar = new ArrayList<>();
			int sayi;
			do {
				System.out.print("Bir sayı giriniz: (Bitirmek için '0') ");
				sayi = scanner.nextInt();
				if (sayi != 0) {
					// sayıyı sakla
					sayilar.add(sayi);
				}
			} while (sayi != 0);
			System.out.println("Girilen sayıların tersten sıraki değerli:");
			for (int i = sayilar.size() - 1; i >= 0; i--) {
				System.out.println(sayilar.get(i));
			}
		}
		// try bloğunun dışı. Scanner sınıfı kapalı

	}
}
