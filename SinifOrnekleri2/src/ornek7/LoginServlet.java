package ornek7;

public class LoginServlet extends BaseServlet {

	@Override
	public void doGet(Request request) {
		System.out.println("LoginServlet'in doGet metodu çalıştı");
	}

	@Override
	public void doPost(Request request) {
		System.out.println("LoginServlet'in doPost metodu çalıştı");
	}

}
