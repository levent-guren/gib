package ornek10;

public class Calistir {
	public static void main(String[] args) {
		Araba araba1 = new Araba();
		Araba araba2 = new Araba();
		araba1.hiz = 100;
		araba2.hiz = 80;
		Araba.marka = "Audi";
		Araba.marka = "Honda";
		System.out.println(araba1.hiz);
		System.out.println(Araba.marka);
		System.out.println(araba2.hiz);
		System.out.println(Araba.marka);
	}
}
