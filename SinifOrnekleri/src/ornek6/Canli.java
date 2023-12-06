package ornek6;

public class Canli extends Object {
	private int toplamEnerji = 100;

	public int getToplamEnerji() {
		return toplamEnerji;
	}

	public void setToplamEnerji(int yeniDeger) {
		toplamEnerji = yeniDeger;
	}

	public void enerjiTuket() {
		System.out.println("Canli sınıfındaki enerjiTuket çağırıldı");
		toplamEnerji -= 5;
	}
}
