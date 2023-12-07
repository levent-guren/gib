package odev3;

import java.util.Scanner;

public class Calistir {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int girilenSayi = scanner.nextInt();
		for (int i = 2; i < girilenSayi; i++) {
			if (asalMi(i)) {
				// i asaldir.
				System.out.println(i);
			}
		}
		scanner.close();
	}

	public static boolean asalMi(int sayi) {
		for (int i = 2; i < sayi - 1; i++) {
			if (sayi % i == 0) {
				// sayi, i değişkenindeki değere tam bölünüyor.
				return false;
			}
		}
		return true;
	}
}
