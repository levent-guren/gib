package ornek11;

public class Calistir {
	static {
		System.out.println("Calistir sınıfı yüklendi");
	}

	public Calistir() {
		System.out.println("Calistir instance'ı oluşturuldu");
	}

	public static void main(String[] args) {
		System.out.println("Main çalışıyor");
		new Calistir().basla();
	}

	public void basla() {
		System.out.println("Başla çalışıyor");
		System.out.println(new Personel());
	}
}
