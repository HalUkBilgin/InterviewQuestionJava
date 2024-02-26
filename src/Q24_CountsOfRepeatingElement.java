import java.util.Arrays;
import java.util.Scanner;

public class Q24_CountsOfRepeatingElement {
    /*  Task->
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
            Verilen arrayde istenen sayının tekrar saysını print eden code create ediniz.
     */

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 1, 3, 4, 5, 6, 5, 3, 2, 1, 5, 4, 3, -6, -6};
        System.out.println("arr = " + Arrays.toString(arr));
        Scanner input = new Scanner(System.in);
        System.out.println("agam bi sayı giresen : ");

        int istenenSayi = input.nextInt();
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] ==istenenSayi){
                count++;
            }

        }
        System.out.println("istenen sayi : "+istenenSayi+" arrayda "+count+" kadar kullanıldı");
    }
}
