package ornek4;

public class Kopek extends Canli {
	void enerjiTuket() { // method overriding
		toplamEnerji -= 10;
	}

	public String toString() {
		return "Köpek enerji:" + toplamEnerji;
	}
}
