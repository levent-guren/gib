package ornek1;

public class Calistir {
	public static void main(String[] args) {
		Sayac sayac1 = new Sayac();
		Sayac sayac2 = new Sayac();
//		sayac1.run();
//		sayac2.run();
		sayac1.start();
		sayac2.start();
		System.out.println("Program sonu");
	}
}
