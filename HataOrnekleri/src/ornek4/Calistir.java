package ornek4;

public class Calistir {
	public static void main(String[] args) throws InterruptedException {
		try {
			test(0);
		} catch (Hata e) {
			e.printStackTrace();
		}
	}

	private static void test(int a) throws Hata {
		if (a == 0) {
			Hata hata = new Hata();
			throw hata;
		} else {
			System.out.println("Hata yok");
		}
	}
}
