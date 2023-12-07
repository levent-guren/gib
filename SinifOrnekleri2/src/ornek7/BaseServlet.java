package ornek7;

public abstract class BaseServlet {
	public final void service(Request request) {
		System.out.println("BaseServlet.service çalıştı. İşlemi log'la");
		if (request.getTip() == Request.GET) {
			// get
			doGet(request);
		} else if (request.getTip() == Request.POST) {
			// post
			doPost(request);
		}
		System.out.println("Veritabanı connection'larını kapat");
	}

	public abstract void doGet(Request request);

	public abstract void doPost(Request request);
}
