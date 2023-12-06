package ornek5;

public class Canli extends Object {
	int toplamEnerji = 100;

	void enerjiTuket() {
		System.out.println("Canli sınıfındaki enerjiTuket çağırıldı");
		toplamEnerji -= 5;
	}
}
