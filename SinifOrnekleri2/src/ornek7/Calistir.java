package ornek7;

public class Calistir {
	public static void main(String[] args) {
		LoginServlet servlet1 = new LoginServlet();
		RaporServlet servlet2 = new RaporServlet();
		servlet1.service(new Request("/login", Request.GET));
		servlet2.service(new Request("/rapor?id=12", Request.POST));
	}
}
