package siralama4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calistir2 {
	public static void main(String[] args) {
		List<Personel> personeller = new ArrayList<Personel>();
		personeller.add(new Personel(38, "Kamile"));
		personeller.add(new Personel(23, "Lalezar"));
		personeller.add(new Personel(41, "Menkıbe"));
		personeller.add(new Personel(19, "Piraye"));
		personeller.add(new Personel(53, "Abuzer"));
		// @formatter:off
		Collections.sort(personeller, 
				(Personel p1, Personel p2) -> Integer.valueOf(p1.getYas()).compareTo(p2.getYas()));
		// @formatter:on
		personeller.forEach(System.out::println);
		System.out.println("--------------------");
		// @formatter:off
		Collections.sort(personeller, 
				(Personel p1, Personel p2) -> p1.getAdi().compareTo(p2.getAdi()));
		// @formatter:on
		personeller.forEach(System.out::println);
		System.out.println("--------------------");
		// @formatter:off
		Collections.sort(personeller, 
				(Personel p1, Personel p2) -> p1.getAdi().compareTo(p2.getAdi()) * -1);
		// @formatter:on
		personeller.forEach(System.out::println);

	}
}
