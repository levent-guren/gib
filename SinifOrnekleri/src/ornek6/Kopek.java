package ornek6;

public class Kopek extends Canli {
	private int toplamEnerji = 100;

	public int getToplamEnerji() {
		return toplamEnerji;
	}

	public void setToplamEnerji(int yeniDeger) {
		toplamEnerji = yeniDeger;
	}

	public void enerjiTuket() { // method overriding
		System.out.println("Kopek sınıfındaki enerjiTuket çağırıldı");
		super.enerjiTuket();
		toplamEnerji -= 10;
	}

	public String toString() {
		return "Köpek enerji:" + toplamEnerji + " canlidan gelen enerji:"
				+ super.getToplamEnerji();
	}
}
