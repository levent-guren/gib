package ornek3;

public class Sayac implements Runnable {
	private static int sayi = 0;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			ekle();
		}
		System.out.println("Thread sonlandi sayi = " + sayi);
	}

	private static synchronized void ekle() {
		int eskiDeger = sayi;
		bekle(100);
		sayi = eskiDeger + 1;
	}

	private static void bekle(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
		}
	}

}
