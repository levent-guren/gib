package odev;

import java.util.Scanner;

public class Calistir {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int buyukluk = scn.nextInt();
		for (int satir = 1; satir <= buyukluk; satir++) {
			for (int yildiz = 0; yildiz < satir; yildiz++) {
				System.out.print('*');
			}
			System.out.println();
		}
		scn.close();
	}
}
