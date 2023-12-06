package ornek3;

public class Araba extends Tasit {
	// alttaki contructor yazılmadığında,
	// super (Tasit) sinifinin default (parametre almayan)
	// constructor'ı olmadığından hata veriyor
	public Araba(int fiyat) {
		super(fiyat);
	}

}
