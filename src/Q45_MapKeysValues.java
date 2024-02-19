import java.util.HashMap;
import java.util.Map;

public class Q45_MapKeysValues {
    //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
    //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
    //5 tane ulke ismi yazdırıyoruz. (keyset())
    //5 tane ulke nufusunu yazdırıyoruz. (values())
    //nüfusların toplamını yazdırın.
    //kaç tane 50 milyondan fazla nüfuslu ülke var?

    public static void main(String[] args) {

        HashMap<String, Integer> country = new HashMap<>();
        country.put("Almanya", 80);
        country.put("Turkiye", 83);
        country.put("Amerika", 332);
        country.put("Fransa", 70);
        country.put("Kanada", 40);

        System.out.println("ulke isimleri ve nufuslari : \n" + country + " milyondur");

        System.out.println("ulke isimleri : " + country.keySet());
        //ulke isimleri : [Turkiye, Fransa, Kanada, Almanya, Amerika]

        System.out.println("ulke nufuslari : " + country.values());
        //ulke nufuslari : [83, 70, 40, 80, 332]


        int toplam = 0;
        for (Integer each : country.values()) {
            toplam += each;
        }

        System.out.println("nufuslarin toplam = " + toplam); //nufuslarin toplam = 605


        int ellidenBuyukSayisi = 0;
        for (Integer each : country.values()) {
            if (each > 50) {
                ellidenBuyukSayisi++;
            }
        }
        System.out.println("ellidenBuyukSayisi = " + ellidenBuyukSayisi);//ellidenBuyukSayisi = 4


        for (Map.Entry<String, Integer> siralama : country.entrySet()) {
            System.out.println(siralama);
        }

    }
}
