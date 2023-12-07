package collection;

import java.util.HashMap;
import java.util.Map;

public class Calistir6 {
	public static void main(String[] args) {
		Map<Integer, String> sehirler = new HashMap<>();
		sehirler.put(6, "Ankara");
		sehirler.put(38, "Kayseri");
		sehirler.put(1, "Adana");
		sehirler.put(67, "Zonguldak");
		sehirler.put(13, "Bitlis");

		System.out.println(sehirler.get(1));
		System.out.println(sehirler.get(13));
		System.out.println(sehirler.get(6));
	}
}
