package ornek11;

public class Personel {
	static {
		System.out.println("Personel sınıfı yüklendi");
	}

	public Personel() {
		System.out.println("Personel instance'ı oluşturuldu");
	}

	@Override
	public String toString() {
		System.out.println("toString");
		return "5";
	}
}
