package ornek4;

public class Calistir {
	public static void main(String[] args) {
		Sayac sayac1 = new Sayac();
		Sayac sayac2 = new Sayac();

		Thread t1 = new Thread(sayac1);
		Thread t2 = new Thread(sayac2);

		t1.start();
		t2.start();
		System.out.println("Program sonu");
	}
}
