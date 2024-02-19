public class Q18_MultipleMethodVarargs {
    /* Task->
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	print eden  parametreli method create ediniz.
 */
    public static void main(String[] args) {
        notHesapla("Zeynep",78,81,90,66,83);
        notHesapla("Ahmet",78,81,90,78);
        notHesapla("Leyla",78,81,90);
        notHesapla("Mehmet",78,81,90,66);

    }//main sonu

    private static void notHesapla(String name, double... notes) {
        double toplam=0;
        for (double w:notes) {
            toplam+=w;
        }
        System.out.println(name+" not ortalamasi : "+Math.round(toplam/notes.length));
    }
}//Class sonu
