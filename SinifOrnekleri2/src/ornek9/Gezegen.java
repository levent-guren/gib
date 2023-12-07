package ornek9;

public enum Gezegen {
	MERKUR(13, 1200), VENUS(18, 400), DUNYA(100, 24), MARS(3, -60);

	int buyukluk;
	int sicaklik;

	private Gezegen(int buyukluk, int sicaklik) {
		this.buyukluk = buyukluk;
		this.sicaklik = sicaklik;
	}

	public int getGezegenSicakligi() {
		return sicaklik;
	}

	public int getGezegenBuyukluk() {
		return buyukluk;
	}

	@Override
	public String toString() {
		return name() + " büyüklük:" + buyukluk + ", sıcaklık:" + sicaklik;
	}
}
