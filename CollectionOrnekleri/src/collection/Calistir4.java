package collection;

import java.util.Arrays;
import java.util.List;

public class Calistir4 {
	public static void main(String[] args) {
		List<String> liste = Arrays.asList("Ankara", "İstanbul", "İzmir",
				"Adana", "Kayseri");

		System.out.println(liste.get(1));
		System.out.println(liste.get(3).length());
	}
}
