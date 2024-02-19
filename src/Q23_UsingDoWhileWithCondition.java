import java.util.Scanner;

public class Q23_UsingDoWhileWithCondition {
    /*  Task->
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"
        Girilen bir sayı için 100'den küçük ise  "Won!"
        değilse "Lost!" print eden code create ediniz.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= input.nextInt();
        if (sayi<100) System.out.println("Won");
        else System.out.println("Lost");
    }
}
