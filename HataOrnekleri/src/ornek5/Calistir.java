package ornek5;

public class Calistir {
	public static void main(String[] args) {
		try {
			test(0);
		} catch (Exception e) {
			System.out.println("Hata oluştu");
		}
	}

	private static void test(int a) {
		if (a == 0) {
			Hata hata = new Hata();
			throw hata;
		} else {
			System.out.println("Hata yok");
		}
	}
}
