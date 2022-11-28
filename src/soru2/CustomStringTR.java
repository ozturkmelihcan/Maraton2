package soru2;

public class CustomStringTR {

	private String word;
	
	

	public CustomStringTR(String word) {
		super();
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "CustomStringTR [word=" + word + "]";
	}
	
	public void uzunluk() {
		
		System.out.println("Kelime uzunluğu : " + this.word.length());
	}
	
	public void karakterKucult() {
		System.out.println("karakterleri küçült : " + this.word.toLowerCase());
	}
	
	public void karakterBuyut() {
		System.out.println("karakterleri büyüt : " + this.word.toUpperCase());
	}
	
	public void ilkKarakteriGoster() {
		System.out.println("ilk karakter: " + this.word.charAt(0));
	}
	
	public void sonKarakteriGoster() {
		System.out.println("Son karakter: " + this.word.charAt(word.length()-1));
	}
	
	public void yarisindanSonrasiniGoster() {
		System.out.println("Metnin yarısından sonrası: " + this.word.substring(word.length()/2));
	}
	
	public void aIleBaslıyorMu() {
		if(this.word.startsWith("a")) {
			System.out.println("a ile başlıyor.");
		}else {
			System.out.println("a ile başlamıyor.");
		}
	}
	
	public void bosMu() {
		System.out.println("metnin içi boş mu? : " + this.word.isEmpty());
	}
	
	public void boslukSil() {
		System.out.println("metindeki boslukları sil: " + this.word.strip());
	}
	
	public void degerArama() {
		System.out.println("a harfi kaçıncı indexte: " + this.word.indexOf("a") );
	}
	
	public void cVarmı() {
		System.out.println("c harfi var mı?: " + this.word.contains("c"));
	}
	
}
