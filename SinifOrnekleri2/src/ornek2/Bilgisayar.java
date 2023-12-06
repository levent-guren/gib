package ornek2;

public class Bilgisayar {
	private String marka;

	public Bilgisayar() {
		this("ACER");
	}

	public Bilgisayar(String marka) {
		this.marka = marka;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

}
