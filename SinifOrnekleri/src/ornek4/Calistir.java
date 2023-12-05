package ornek4;

public class Calistir {

	public static void main(String[] args) {
		Kopek karabas = new Kopek();
		System.out.println(karabas.toplamEnerji);
		karabas.enerjiTuket();
		System.out.println(karabas.toplamEnerji);

		// toString() otomatik olarak çağırılır
		System.out.println(karabas);
	}

}
