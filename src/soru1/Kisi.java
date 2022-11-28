package soru1;

public class Kisi {
	private String adSoyad;
	private String sehir;
	private long telefonNo;
	
	
	public Kisi(String adSoyad, String sehir, long telefonNo) {
		super();
		this.adSoyad = adSoyad;
		this.sehir = sehir;
		this.telefonNo = telefonNo;
	}
	public String getAdSoyad() {
		return adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public long getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(long telefonNo) {
		this.telefonNo = telefonNo;
	}
	@Override
	public String toString() {
		return "Kisi [adSoyad=" + adSoyad + ", sehir=" + sehir + ", telefonNo=" + telefonNo + "]";
	}

}
