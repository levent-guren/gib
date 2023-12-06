package ornek6;

public class Calistir {

	public static void main(String[] args) {
		Kopek karabas = new Kopek();
		System.out.println(karabas.getToplamEnerji());
		karabas.enerjiTuket();
		System.out.println(karabas.getToplamEnerji());

		// toString() otomatik olarak çağırılır
		System.out.println(karabas);

		Canli canli = karabas;
		System.out.println(canli.getToplamEnerji());
		System.out.println(karabas.getToplamEnerji());
		karabas.enerjiTuket();
		System.out.println("-----------------------");
		canli.enerjiTuket();

	}

}
