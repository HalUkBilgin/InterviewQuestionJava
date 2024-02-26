import java.util.Scanner;

public class Q21_CountFactors {
    /* Task->
      Type java code by using while loop,
     Write a program to count the factors of an integer which is entered by user.
     Girilen sayının pozitif tam bolen sayısını print eden code create ediniz.
     Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
     Factors of 8  = 1, 2, 4, 8 ==> 4
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("agam bi sayı giresen : ");
        int sayi = input.nextInt();
        int count = 0;
        int bolen = 1;

        System.out.println("   *** while loop   ***   ");

        while (bolen <= sayi) {// 1,2,3...sayi kadar bir tekrar tanımlandı
            if (sayi % bolen == 0) {//tekrardan gelen her bir sayı girlen sayıy tam bolme sartı tanımlandı
                count++;
                System.out.print(bolen + " ");
            }
            bolen++;

        }
        System.out.println();
        System.out.println(sayi + " nın " + count + " tane tam boleni var ");
        System.out.println("   *** for loop   ***   ");
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(sayi + " nın " + count + " tane tam boleni var ");

    }
}
