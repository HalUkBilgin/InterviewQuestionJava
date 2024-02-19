import java.util.HashMap;
import java.util.Scanner;

public class Q51_StoreMap {
    /* 1- Kullanıcıdan bir kişinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
       2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
       3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
       4- Tüm kullanicilarin isimlerini ekrana yazdıralım
    */
    public static void main(String[] args) {


        String secim = "";
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, HashMap<String, String>> kisiListesi = new HashMap<>();
        do {
            HashMap<String, String> kisiBilgileri = new HashMap<>();
            System.out.println("lutfen adinizi ve soyadinizi giriniz :");
            kisiBilgileri.put("isim", sc.nextLine());

            System.out.println("lutfen adresinizi giriniz :");
            kisiBilgileri.put("adres", sc.nextLine());

            System.out.println("lutfen tel no giriniz :");
            kisiBilgileri.put("tel", sc.nextLine());

            System.out.println("4 haneli kimlik no giriniz :");
            kisiListesi.put(sc.nextInt(), kisiBilgileri);
            sc.nextLine(); //dummy gerekli.. dongunun saglikli ilerlemesi icin

            System.out.println(kisiBilgileri);
            System.out.println(kisiListesi);
            System.out.println("devam etmek istiyor musunz (E/H) ");
            secim = sc.next();
            sc.next();
        }
        while (secim.equalsIgnoreCase("E"));

        System.out.println("goruntulemek istedginiz kisinin kimlik nosunu giriniz : ");
        System.out.println(kisiListesi.get(sc.nextInt()));

    }


}