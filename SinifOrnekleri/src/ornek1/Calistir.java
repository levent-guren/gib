package ornek1;

public class Calistir {

	public static void main(String[] args) {
		Personel p = null;
		p = new Personel();
		p.adi = "Peri";
		p.yas = 27;
		System.out.println(p.adi);
		Personel p2 = p;
		System.out.println(p2.yas);
	}

}
