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
        System.out.println("Bir sayi gir");
        int sayi= input.nextInt();
        int bolenSayi=0;
        System.out.println("****For ile****");
        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                bolenSayi++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println(sayi+" saysinin "+bolenSayi+" tane pozitif tam boleni vardir");
    }
}
