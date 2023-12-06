package ornek4;

public class SayiOrnekleri2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = 5;
		String s = String.valueOf(a);

		String b = "12";
		int c = Integer.valueOf(b);

		int d = 3;
		Integer e = Integer.valueOf(d);

		int f = e.intValue();

		Integer g = Integer.valueOf(8);
		String h = g.toString();

		String m = "123";
		Integer p = Integer.valueOf(m);

		// yanlış yöntem:
		int k = 45;
		String o = k + "";
	}
}
