import java.util.Scanner;

public class Q03_PrimeNumber {
    /* Task->
    Ask user enter a positive number and check if it is prime or not
    Girilen  pozitif bir sayı asal olmasını kontrol eden code create ediniz.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pozitif bir sayi giriniz");
        int sayi= input.nextInt();
        boolean asalMi=true;
        if (sayi>=2){
            for (int i = 2; i < sayi; i++) {
                if (sayi%i==0){
                    asalMi=false;
                    break;
                }
            }
            if (asalMi){
                System.out.println("Girilen "+sayi+" sayisi asaldir");
            }else System.out.println("Girilen sayi asal degildir");
        }else {
            System.out.println("Girilen sayi asal degildir");
        }

    }
}
