import java.util.ArrayList;
import java.util.Scanner;

public class Q10_FibonacciListNumber {

    /* Task-!
     Girilen bir tamsayıya kadar FIBONACCI dizisini print eden code create ediniz.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= input.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        if (sayi<=0){
            System.out.println("Duzgun bir sayi gir arkadas");
        } else if (sayi==1) {
            list.add(1);
            System.out.println(list);
        } else if (sayi==2) {
            list.add(1);
            list.add(1);
            System.out.println(list);
        }else {
            int sayi1=1;
            int sayi2=1;
            list.add(sayi1);
            list.add(sayi2);
            int sayi3;
            for (int i = 3; i <=sayi ; i++) {
                sayi3=sayi1+sayi2;
                list.add(sayi3);
                sayi1=sayi2;
                sayi2=sayi3;
            }
            System.out.println(list);
        }

    }
}