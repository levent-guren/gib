package ornek1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personel {
	private String adi;
	private String soyadi;
	private int yasi;
	/* 
    @formatter:off
	public Personel(String adi, String soyadi, int yasi) {
		this.adi = adi;
		this.soyadi = soyadi;
		this.yasi = yasi;
		setAdi(adi);
		System.out.println("Personel yaratılıyor");
	}
	@formatter:on
	*/

}
