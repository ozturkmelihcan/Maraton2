package soru3;

public abstract class Surungen extends Hayvan {

	public Surungen(String ad, int kilo, int uzunluk) {
		super(ad, kilo, uzunluk);
		
	}

	
	@Override
	public String toString() {
		return "Surungen [toString()=" + super.toString() + "]";
	}


	public abstract void surun();
}
