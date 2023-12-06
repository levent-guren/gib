package ornek2;

public class Calistir {
	public static void main(String[] args) {
		System.out.println(new Bilgisayar().getMarka());
		System.out.println(new Bilgisayar("HP").getMarka());
		System.out.println(new Masaustu().getMarka());
		System.out.println(new Masaustu("DELL").getMarka());
	}
}
