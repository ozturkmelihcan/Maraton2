package soru4;

import java.util.HashMap;
import java.util.Map;

public class BusinessYolcu extends Yolcu {
	private boolean checkIn;
	private boolean isVIP;
	private static int BUSINESSFIYAT = 200;
	private static int BUSINESSVIPFIYAT = 150;
	public static Map<String, Integer> biletBilgi = new HashMap<>();
	public static Map<String, Integer> biletList = new HashMap<>();
	public BusinessYolcu(String ad, int id, String soyad, boolean isVIP) {
		super(ad, id, soyad);
		
	}
	
	

	public static int getBUSINESSFIYAT() {
		return BUSINESSFIYAT;
	}



	public static void setBUSINESSFIYAT(int bUSINESSFIYAT) {
		BUSINESSFIYAT = bUSINESSFIYAT;
	}



	public static int getBUSINESSVIPFIYAT() {
		return BUSINESSVIPFIYAT;
	}



	public static void setBUSINESSVIPFIYAT(int bUSINESSVIPFIYAT) {
		BUSINESSVIPFIYAT = bUSINESSVIPFIYAT;
	}



	public boolean isVIP() {
		return isVIP;
	}



	public void setVIP(boolean isVIP) {
		this.isVIP = isVIP;
	}



	@Override
	public void yolcuBilgileriniGetir() {
		if(isBiletAldiMi()){
			if(isVIP) {
				System.out.println("Business VIP Yolcusu " + getAd() + " " + getSoyad() + " isimli yolcunun biletleri:" + biletList );
			}else {
				System.out.println("Business Yolcusu " + getAd() + " " + getSoyad() + " isimli yolcunun biletleri:" + biletList );
			}
		}else {
			System.out.println("Önce biletinizi almanız gerekmektedir.");
		} 
		
	}

	@Override
	 public void biletAl(EFirmaAdi firmaAdi) {
		setBiletAldiMi(true);
		setFirmaAdi(firmaAdi);
		
		if(isVIP) {
			int biletFiyati = (int) (getBASEFIYAT() + this.BUSINESSFIYAT+ this.BUSINESSVIPFIYAT);
			biletBilgi.put(firmaAdi.name(), biletFiyati);
			biletList.put(firmaAdi.name(), getKoltukNo());
			System.out.println("Bilet alınmıştır. Bilet bilgileriniz: " + biletBilgi + " TL'dir.");
		}else {
			int biletFiyati = (int) (getBASEFIYAT() + this.BUSINESSFIYAT);
			biletBilgi.put(firmaAdi.name(), biletFiyati);
			biletList.put(firmaAdi.name(), getKoltukNo());
			System.out.println("Bilet alınmıştır. Bilet bilgileriniz: " + biletBilgi + " TL'dir.");
		}
		
	}

	@Override
	public void checkInYap() {
		if(isBiletAldiMi()){
			if(checkIn) {
				System.out.println("Check-in zaten yapılmıştır.");
			}else {
				setCheckIn(true);
				System.out.println("Check-in yapılmıştır. İyi yolculuklar ");
			}
		}else {
			System.out.println("Önce biletinizi almanız gerekiyor.");
		}
		
	}

	@Override
	public void ucagaBin() {
		if(checkIn==true) {
			System.out.println(getAd() + " " + getSoyad() + " isimli yolcu " + getFirmaAdi() + " firmasının uçağına binmiştir.");
		}
		
	}
	

	
	
}
