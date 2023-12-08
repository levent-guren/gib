package odev4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Calistir {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			List<Integer> sayilar = new ArrayList<>();
			String girilenDeger;
			do {
				System.out.print("Bir sayı giriniz (Bitirmek için '.') ");
				girilenDeger = scn.next();
				if (!".".equals(girilenDeger)) {
					sayilar.add(Integer.valueOf(girilenDeger));
				}
			} while (!".".equals(girilenDeger));
			Collections.sort(sayilar);
			sayilar.forEach(System.out::println);
		}
	}
}
