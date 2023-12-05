package ornek5;

public class Kopek extends Canli {
	int toplamEnerji = 100;

	void enerjiTuket() { // method overriding
		super.enerjiTuket();
		toplamEnerji -= 10;
	}

	public String toString() {
		return "Köpek enerji:" + toplamEnerji + " canlidan gelen enerji:"
				+ super.toplamEnerji;
	}
}
