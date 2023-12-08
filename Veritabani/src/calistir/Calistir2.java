package calistir;

import java.util.List;
import java.util.Scanner;

import dao.PersonelDAO;
import entity.Personel;

public class Calistir2 {
	private PersonelDAO personelDAO;
	private Scanner scn;

	public Calistir2() {
		personelDAO = new PersonelDAO();
		scn = new Scanner(System.in);
	}

	public static void main(String[] args) {
		new Calistir2().menu();
	}

	public void menu() {
		String secim;
		do {
			System.out.println("Ana Menü");
			System.out.println();
			System.out.println("1- Personel Listesi");
			System.out.println("2- Personel Ekleme");
			System.out.println("3- Çıkış");
			System.out.print("Seçiniz: ");
			secim = scn.next();
			switch (secim) {
			case "1": {
				personelListesi();
				break;
			}
			case "2": {
				personelEkleme();
				break;
			}
			default:
				if (!"3".equals(secim)) {
					System.out.println(
							"Yanlış seçim yaptınız. Tekrar deneyiniz.");
				}
			}
		} while (!"3".equals(secim));
		System.out.print("Hoşçakalın");
		scn.close();
	}

	private void personelEkleme() {
		System.out.println("Personel Ekleme:");
		System.out.println();
		System.out.print("Adı: ");
		String adi = scn.next();
		System.out.print("Soyadı: ");
		String soyadi = scn.next();
		System.out.print("Email: ");
		String email = scn.next();
		Personel p = new Personel();
		p.setAdi(adi);
		p.setSoyadi(soyadi);
		p.setEmail(email);
		personelDAO.savePersonel(p);
		System.out.println("Personel eklenmiştir.");
	}

	private void personelListesi() {
		System.out.println("Personel Listesi:");
		System.out.println();
		List<Personel> personeller = personelDAO.getPersoneller();
		personeller.forEach(p -> {
			System.out.println(p.getId() + " " + p.getAdi() + " "
					+ p.getSoyadi() + " " + p.getEmail());
		});
		System.out.println();
	}
}
