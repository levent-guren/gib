package ornek1;

import java.time.DateTimeException;

public class Calistir {
	public static void main(String[] args) {
		try {
			int a = 3;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ex) {
			System.out.println("Bölme hatası oluştu");
		} catch (DateTimeException ex) {
			System.out.println("Tarih hatası oluştu");
		} catch (Exception ex) {
			System.out.println("Hata oluştu");
		}
		System.out.println("Program sonu");
	}
}
