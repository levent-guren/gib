package deneme;

public class Ornek12 {
	public static void main(String[] args) {
		String[][] isimler = new String[2][1];
		isimler[0] = new String[2];
		isimler[1][0] = "Kamuran";
		isimler[0][1] = "Kamile";
		isimler[0][0] = isimler[1][0];
		isimler[1] = isimler[0];
		System.out.println(isimler[1].length);
		System.out.println(isimler.length);
		System.out.println(isimler[1][1]);
	}
}
