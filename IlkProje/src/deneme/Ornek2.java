package deneme;

public class Ornek2 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i=" + i + ", j=" + j);
		}
		int p = 3;
		while (p % 7 < 5) {
			System.out.println(p++);
		}
		System.out.println("----------------");
		p = 3;
		do {
			System.out.println(++p);
		} while (p < 5);
	}
}
