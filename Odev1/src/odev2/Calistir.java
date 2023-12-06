package odev2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calistir {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi;
		int adet = 0;
		int toplam = 0;
		do {
			System.out.println("Bir sayı giriniz:");
			sayi = scanner.nextInt();
			if (sayi != 0) {
				adet++;
				toplam += sayi;
			}
		} while (sayi != 0);
		double ortalama = toplam / (double) adet;
		// ortalama = Math.round(ortalama * 100) / 100.0;

		System.out.println(adet + " adet sayı girdiniz.");
		System.out
				.println("Girmiş olduğunuz sayıların ortalaması: " + ortalama);
		System.out.println(new DecimalFormat("#.##").format(ortalama));
		scanner.close();
	}
}
