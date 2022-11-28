package soru1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Soru1 {
    static Map<String,Long> kisiler = new HashMap<>();
    public static void main(String[] args) {


        try(Scanner scan = new Scanner(new FileReader("rehber.txt"))){
            while(scan.hasNextLine()) {
                String okunanSatir = scan.nextLine();
                System.out.println(okunanSatir);
                String [] arr= okunanSatir.split(";");
                kisiler.put(arr[0],Long.parseLong(arr[2].trim()));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı hatası yakalandı.");
        }
        System.out.println(kisiler);

        kisiArama();

    }
    public static void kisiArama() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen telefonunu aradğınız kişinin adını giriniz:");
        String isim= scan.nextLine();

        System.out.println("Lütfen telefonunu aradğınız kişinin soyadını giriniz:");
        String soyad= scan.nextLine();

        String adSoyad = isim+" "+soyad;
        System.out.println(adSoyad);

        if(kisiler.containsKey(adSoyad)) {
            System.out.println(adSoyad+" isimli kişinin telefon numarası: "+kisiler.get(adSoyad));
        } else {
            System.out.println("Böyle bir kişi yoktur.");
        }



    }


}