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
        Scanner scan=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+".elemeni giriniz");
            list.add(scan.nextInt());
        }
        System.out.println("ilk giriste"+list);
        Collections.reverse(list);
        System.out.println("Tersten siralanmis : "+list);
        Collections.shuffle(list);
        System.out.println("Karistirilmis : "+list);
        Collections.rotate(list,3);
        System.out.println("3 br kaymis : "+list);
        int maxEleman=Collections.max(list);
        int minEleman=Collections.min(list);
        System.out.println("maxEleman = " + maxEleman);
        System.out.println("minEleman = " + minEleman);
        Collections.replaceAll(list,maxEleman,minEleman);
        System.out.println("Max min yer degismis list : "+list);
    }
}
