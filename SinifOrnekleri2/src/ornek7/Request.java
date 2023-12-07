package ornek7;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Request {
	private String url;
	private int tip;
	public static final int GET = 0;
	public static final int POST = 1;
}
