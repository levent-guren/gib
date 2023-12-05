package deneme;

public class Ornek11 {
	public static void main(String[] args) {
		int[][] sayilar = new int[3][];
		sayilar[1] = new int[3];
		sayilar[1][1] = 5;
		sayilar[2] = new int[5];
		System.out.println(sayilar[0]);
		System.out.println(sayilar[1][1]);
		System.out.println(sayilar[2][3]);

		sayilar[0] = sayilar[1];
		sayilar[1][2] = 3;
		System.out.println(sayilar[0][2]);

		sayilar[2] = sayilar[1];
		System.out.println(sayilar[2][2]);

		sayilar[1] = sayilar[2]; // etkisi yok!

	}
}
