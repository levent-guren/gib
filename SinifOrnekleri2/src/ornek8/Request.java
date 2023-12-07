package ornek8;

import lombok.Data;

@Data
public class Request {
	private String url;
	private RequestTypes tip;
}
