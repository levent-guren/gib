package ornek9;

public class Calistir {
	public static void main(String[] args) {
		Gezegen gezegen1 = Gezegen.DUNYA;
		Gezegen gezegen2 = Gezegen.MARS;
		System.out.println(gezegen1);
		System.out.println(gezegen2);

		System.out.println(gezegen1.getGezegenSicakligi());
	}
}
