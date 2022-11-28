package soru1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class Soru1 {

	static Set<Kisi> kisiler = new HashSet<>();

	public static void main(String[] args) {

		
		try (Scanner scan = new Scanner(new FileReader("rehber.txt"))) {
			while (scan.hasNextLine()) {
				String okunanSatir = scan.nextLine();
				System.out.println(okunanSatir);
				String[] arr = okunanSatir.split(";");
				Kisi kisi = new Kisi(arr[0], arr[1], Long.parseLong(arr[2].trim()));
				kisiler.add(kisi);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı hatası...");
		}
		System.out.println(kisiler);

	}

	public static void arama() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen telefonunu aradğınız kişinin adını giriniz:");
		String isim = scan.nextLine();

		System.out.println("Lütfen telefonunu aradğınız kişinin soyadını giriniz:");
		String soyad = scan.nextLine();

		String adSoyad = isim + " " + soyad;
		if (kisiler.contains(adSoyad)) {
			System.out.println(adSoyad + " isimli kişinin telefon numarası: ");
		}

	}
	
	


}
