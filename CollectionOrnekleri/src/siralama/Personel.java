package siralama;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Personel implements Comparable<Personel> {
	private int yas;
	private String adi;

	@Override
	public int compareTo(Personel o) {
		if (yas > o.getYas()) {
			return 1;
		} else if (yas < o.getYas()) {
			return -1;
		} else {
			return 0;
		}
	}
}
