package ornek4;

public class SayiOrnekleri3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Integer s1 = Integer.valueOf(3);
		Integer s2 = Integer.valueOf(5);
		Integer s3 = Integer.valueOf(s1.intValue() + s2.intValue());

		// Autoboxing özelliği ile aynı işlemler aşağıdaki gibi de yazılabiliyor
		Integer i1 = 3;
		Integer i2 = 5;
		Integer i3 = i1 + i2;

		//
		i1 = null;
	}
}
