package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Calistir5 {
	public static void main(String[] args) {
		Set<String> isimler = new HashSet<String>();
		isimler.add("Nazime");
		isimler.add("Nebi");
		isimler.add("Şahsuvar");
		isimler.add("Şuayip");

		Iterator<String> itr = isimler.iterator();
		while (itr.hasNext()) {
			String isim = itr.next();
			System.out.println(isim);
		}
	}
}
