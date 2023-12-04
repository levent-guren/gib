package deneme;

public class Ornek3 {
	public static void main(String[] args) {
		int a = 15;
		// < > <= >=
		// != <> ikisi de eşit değil anlamına geliyor

		if (a < 10) {
			System.out.println("a 10'dan küçüktür");
		} else {
			System.out.println("a 10'dan büyük eşittir");
		}

		int b = 8;

		if (a < 50 && a > b) {
			// a 50'den ufak VE a, b'den büyük
			System.out.println("a 50'den ufak VE a, b'den büyüktür");
		}
		if (a < 20 || b > 20) {
			System.out.println("a<20 veya b>20 dir");
		}
		a = 30;
		if (!(a < 20)) {
			System.out.println("a>=20 dir.");
		}
		if (a == 20) {
			System.out.println("a 20'dir");
		}
	}
}
