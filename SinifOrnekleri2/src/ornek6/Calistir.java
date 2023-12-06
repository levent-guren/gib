package ornek6;

public class Calistir {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Agac agac = new Agac();
		Hayvan hayvan = new Hayvan();
		Kaplan kaplan = new Kaplan();
		Cicek cicek = new Cicek();
		deneyYap(agac);
		deneyYap(hayvan);
		deneyYap(kaplan);
		deneyYap(cicek);
	}

	public static void deneyYap(KolluVeDalli cisim) {
		cisim.kolunuKaldir();
	}
}
