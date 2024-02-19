import java.util.Scanner;

public class Q24_CountsOfRepeatingElement {
    /*  Task->
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
            Verilen arrayde istenen sayının tekrar saysını print eden code create ediniz.
     */

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 6, 8, 4, 5, 6, 7, 5, 4, 9, -6, -6, 0, 2, 0, 2, 2, 2, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= input.nextInt();
        int count=0;
        for (Integer w:arr) {
            if (w==sayi){
                count++;
            }
        }
        if (count==0){
            System.out.println(sayi+" sayisi arrayde hic yok");
        }else System.out.println(sayi+" sayisi arrayde "+count+" defa kullanilmistir");
    }
}
