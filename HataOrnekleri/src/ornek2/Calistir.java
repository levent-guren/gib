package ornek2;

public class Calistir {
	public static void main(String[] args) {
		try {
			test();
			System.out.println(2);
		} catch (Exception ex) {
			System.out.println(5);
		}
	}

	private static void test() {
		try {
			System.out.println(3 / 0);
			System.out.println(3);
		} catch (Exception ex) {
			System.out.println(1);
		}
	}
}
