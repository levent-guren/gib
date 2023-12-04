package deneme;

import java.util.Scanner;

public class Ornek {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yaşınızı giriniz:");
		int yas = scanner.nextInt();
		System.out.println(yas * 2);
		scanner.close();
	}
}
