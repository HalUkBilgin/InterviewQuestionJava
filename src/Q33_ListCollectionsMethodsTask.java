import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q33_ListCollectionsMethodsTask {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    // listeyi ters sırada sırala ve yazdır
    // listeyi karıştır ve yazdır
    // 3 br saga kaydir ve yazdır

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıları minimum sayı ile değiştir


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // part 1

        ArrayList<Integer> sayiList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". sayı   giriniz : ");
            sayiList.add(input.nextInt());

        }
        System.out.println("sayiList insertion order hali " + sayiList);//

        Collections.reverse(sayiList);//sayiList elemanları ters sıralandı
        System.out.println("sayiList eleman ters sıra = " + sayiList);
        Collections.shuffle(sayiList);//sayiList elemanları randon karıstırldı
        System.out.println("sayiList eleman karıstırılmıs hali = " + sayiList);//
        Collections.rotate(sayiList, 3);
        System.out.println("sayiList 3 birim ötelenmiş hali = " + sayiList);
        // part 2
        // int maxSayi=sayiList.get(0); -> amele codeee  :(
        // for (int i = 0; i < 5; i++) {
        //     if (sayiList.get(i)>maxSayi){
        //         maxSayi=sayiList.get(i);
        //     }
        // }
        //System.out.println("maxSayi = " + maxSayi);//
        System.out.println("Collections.max(sayiList) = " + Collections.max(sayiList));//24
        System.out.println("Collections.min(sayiList) = " + Collections.min(sayiList));//04
        int maxSayi = Collections.max(sayiList);
        int minSayi = Collections.min(sayiList);
        Collections.replaceAll(sayiList, maxSayi, minSayi);
        System.out.println(Collections.replaceAll(sayiList, maxSayi, minSayi));// false
        System.out.println("sayiList max min replaceAll sonrası = " + sayiList);//


    }
}
