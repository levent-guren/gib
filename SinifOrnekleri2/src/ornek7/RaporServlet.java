package ornek7;

public class RaporServlet extends BaseServlet {

	@Override
	public void doGet(Request request) {
		System.out.println("RaporServlet'in doGet metodu çalıştı");
	}

	@Override
	public void doPost(Request request) {
		System.out.println("RaporServlet'in doPost metodu çalıştı");
	}

}
