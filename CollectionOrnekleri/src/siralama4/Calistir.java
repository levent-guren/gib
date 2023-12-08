package siralama4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calistir {
	public static void main(String[] args) {
		List<Personel> personeller = new ArrayList<Personel>();
		personeller.add(new Personel(38, "Kamile"));
		personeller.add(new Personel(23, "Lalezar"));
		personeller.add(new Personel(41, "Menkıbe"));
		personeller.add(new Personel(19, "Piraye"));
		personeller.add(new Personel(53, "Abuzer"));

		Collections.sort(personeller, (p1, p2) -> {
			if (p1.getYas() > p2.getYas()) {
				return 1;
			} else if (p1.getYas() < p2.getYas()) {
				return -1;
			} else {
				return 0;
			}
		});
		personeller.forEach(System.out::println);
	}
}
