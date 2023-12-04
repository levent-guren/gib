package deneme;

public class Ornek6 {
	public static void main(String[] args) {
		int a = 20;
		switch (a) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(4);
			break;
		default:
			System.out.println("değer 1,2,3,4 değil");
		}

		for (int i = 0; i < 20; i = i + 2) {
			System.out.println(i);
			if (i > 10) {
				break;
			}
		}
		System.out.println("-----------------------");
		for (int i = 0, j = 20; i < j;) {
			System.out.println("i=" + i);
			j--;
			if (i > 5) {
				continue;
			}
			System.out.println("j=" + j);
			i = i + (20 - j);
		}
	}
}
