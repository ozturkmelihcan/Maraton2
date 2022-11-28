package soru4;

public class Soru4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BusinessYolcu yolcu1 = new BusinessYolcu("ahmet", 1235, "özen", false );
		BusinessYolcu yolcu2 = new BusinessYolcu("mehmet", 1235, "sır", false );
		BusinessYolcu yolcu3 = new BusinessYolcu("kenan", 1235, "pir", true );
		
		
		yolcu3.biletAl(EFirmaAdi.THY);
		yolcu3.biletAl(EFirmaAdi.PGS);
		yolcu3.ucagaBin();
		yolcu3.ucagaBin();
		yolcu3.checkInYap();
		yolcu3.checkInYap();
		
		yolcu3.ucagaBin();
		yolcu3.yolcuBilgileriniGetir();
		
		
		yolcu1.biletAl(EFirmaAdi.ADJ);
		yolcu1.ucagaBin();
		yolcu1.checkInYap();
		yolcu1.yolcuBilgileriniGetir();
	
		
		yolcu2.biletAl(EFirmaAdi.THY);
		yolcu2.ucagaBin();
		yolcu2.checkInYap();
		yolcu2.yolcuBilgileriniGetir();
		
	}

}
