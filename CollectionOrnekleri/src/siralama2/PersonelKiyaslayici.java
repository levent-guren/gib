package siralama2;

import java.util.Comparator;

public class PersonelKiyaslayici implements Comparator<Personel> {

	@Override
	public int compare(Personel o1, Personel o2) {
		if (o1.getYas() > o2.getYas()) {
			return 1;
		} else if (o1.getYas() < o2.getYas()) {
			return -1;
		} else {
			return 0;
		}
	}

}
