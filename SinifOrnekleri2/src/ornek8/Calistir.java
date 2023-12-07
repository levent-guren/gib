package ornek8;

public class Calistir {
	public static void main(String[] args) {
		Request request = new Request();
		request.setTip(RequestTypes.POST);
		System.out.println(request.getTip().ordinal());
	}
}
