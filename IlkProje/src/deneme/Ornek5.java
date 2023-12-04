package deneme;

public class Ornek5 {
	public static void main(String[] args) {
		int a = 5;
		int b = a < 10 ? 3 : a * 2;
		// a<10 koşulu doğru ise 3, değil ise a*2 değerini kullan
		System.out.println(b);
		System.out.println(a < b ? 2 : a == b ? 3 : 5);
	}
}
