package soru4;

import java.util.Random;

public abstract class Yolcu {
	private String ad;
	private int id;
	private String soyad;
	private int koltukNo;
	private boolean checkIn;
	private EFirmaAdi firmaAdi;
	private boolean biletAldiMi;
	
	
	public EFirmaAdi getFirmaAdi() {
		return firmaAdi;
	}
	public boolean isBiletAldiMi() {
		return biletAldiMi;
	}
	public void setBiletAldiMi(boolean biletAldiMi) {
		this.biletAldiMi = biletAldiMi;
	}
	public void setFirmaAdi(EFirmaAdi firmaAdi) {
		this.firmaAdi = firmaAdi;
	}

	private static int BASEFIYAT=100;
	static Random random = new Random();
	
	
	public Yolcu(String ad, int id, String soyad) {
		super();
		
		this.ad = ad;
		this.id = id;
		this.soyad = soyad;
		this.koltukNo = random.nextInt(0,100);
		this.checkIn = checkIn;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getKoltukNo() {
		return koltukNo;
	}
	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}
	public boolean getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}
	public static int getBASEFIYAT() {
		return BASEFIYAT;
	}
	public static void setBASEFIYAT(int bASEFIYAT) {
		BASEFIYAT = bASEFIYAT;
	}
	
	
	@Override
	public String toString() {
		return "Yolcu [ad=" + ad + ", id=" + id + ", soyad=" + soyad + ", koltukNo=" + koltukNo + ", checkIn=" + checkIn
				+ "]";
	}
	
	public abstract void yolcuBilgileriniGetir(); 
	
	public abstract void biletAl(EFirmaAdi firmaAdi );
	
	public abstract void checkInYap();
	
	public abstract void ucagaBin();

}
