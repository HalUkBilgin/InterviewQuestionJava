import java.util.Scanner;


public class Q20_PrintEvenNumber {
    /* Task->
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    Girilen sayını tek-çiftlğini return eden method create ediniz.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= input.nextInt();
        System.out.println(tekCift(sayi));
        System.out.println(tekCift1(sayi));


    }//main sonu

    private static boolean tekCift1(int sayi) {
        return sayi%2==0?true:false;
    }

    private static String tekCift(int sayi) {
        return sayi%2==0?sayi+" cifttir":sayi+" tektir";
    }
}//Class sonu
