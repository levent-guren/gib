package collection;

import java.util.ArrayList;

public class Calistir {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList liste = new ArrayList();
		liste.add("Ankara");
		liste.add("İstanbul");
		liste.add("İzmir");
		liste.add("Adana");
		liste.add("Kayseri");

		System.out.println(liste.get(1));
		System.out.println(((String) liste.get(3)).length());
	}
}
