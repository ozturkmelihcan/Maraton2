package soru4;

import java.util.HashMap;
import java.util.Map;

public class EkonomiYolcu extends Yolcu {

	private int toplam = 0;
	private int EKONOMIKFIYAT = 100;
	public static Map<String, Integer> biletBilgi = new HashMap<>();

	public static Map<String, Integer> biletList = new HashMap<>();

	public EkonomiYolcu(String ad, int id, String soyad, int koltukNo) {
		super(ad, id, soyad);

	}

	public static Map<String, Integer> getBiletBilgi() {
		return biletBilgi;
	}

	public static void setBiletBilgi(Map<String, Integer> biletBilgi) {
		EkonomiYolcu.biletBilgi = biletBilgi;
	}

	public static Map<String, Integer> getBiletList() {
		return biletList;
	}

	public static void setBiletList(Map<String, Integer> biletList) {
		EkonomiYolcu.biletList = biletList;
	}

	public int getEKONOMIKFIYAT() {
		return EKONOMIKFIYAT;
	}

	public void setEKONOMIKFIYAT(int eKONOMIKFIYAT) {
		EKONOMIKFIYAT = eKONOMIKFIYAT;
	}

	
	public int getToplam() {
		return toplam;
	}

	public void setToplam(int toplam) {
		this.toplam = toplam;
	}

	@Override
	public void yolcuBilgileriniGetir() {
		if (isBiletAldiMi()) {
			System.out.println(
					"Business VIP Yolcusu " + getAd() + " " + getSoyad() + " isimli yolcunun biletleri:" + biletList);

		} else {
			System.out.println("Önce biletinizi almanız gerekmektedir.");
		}

	}

	@Override
	public void biletAl(EFirmaAdi firmaAdi) {
		setBiletAldiMi(true);
		int biletFiyati = (int) (getBASEFIYAT() + this.EKONOMIKFIYAT);
		biletBilgi.put(firmaAdi.name(), biletFiyati);
		biletList.put(firmaAdi.name(), getKoltukNo());
		System.out.println("Bilet alınmıştır. Bilet bilgileriniz " + biletBilgi + " TL'dir.");

	}

	@Override
	public void checkInYap() {
		if (isBiletAldiMi()) {
			if (getCheckIn()) {
				System.out.println("Check-in zaten yapılmıştır.");
			} else {
				setCheckIn(true);
				System.out.println("Check-in yapılmıştır. İyi yolculuklar.");
			}
		} else {
			System.out.println("Önce biletinizi almanız gerekiyor.");
		}

	}

	@Override
	public void ucagaBin() {
		if (isBiletAldiMi()) {
			if (getCheckIn()) {

			} else {
				System.out.println("Check-in yapmadan uçağa binemezsiniz. Lütfen önce check-in oluşturun");
			}
		} else {
			System.out.println("Önce biletinizi almanız gerekiyor.");
		}

	}

}
