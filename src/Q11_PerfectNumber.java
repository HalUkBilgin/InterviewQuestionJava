import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11_PerfectNumber {
    /* Task->
    Perfect Number (Mukemmel sayi)
      Girilen bir sayinın mukemmel olmasını kontrol eden method create ediniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= input.nextInt();
        System.out.println(perfectNumber(sayi));

    }//main sonu

    private static String perfectNumber(int sayi) {
        int toplam=0;
        //List<Integer> list=new ArrayList<>();
        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam+=i;
                System.out.print(i+" ");
                //list.add(i);
            }
        }
        //System.out.println(list);
        System.out.println();
        return toplam==sayi?sayi+" sayisi mukemmel sayidir":sayi+" sayisi mukemmel degildir";
    }
}//Class sonu