import java.util.Arrays;
import java.util.Scanner;


public class Q53_IkiboyutluArrayFaktoriyel {


    public static void main(String[] args) {
        // task-> girilen 3x3 iki boyutlu arrayin elemanlarının faktoriyelini print eden method create ediniz
        Scanner scan=new Scanner(System.in);
        int[][] arr=new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Dizinin elemanini giriniz");
                arr[i][j]= scan.nextInt();
            }
        }
        System.out.println("Array: "+ Arrays.deepToString(arr));
        faktoriyel(arr);
    }

    private static void faktoriyel(int[][] arr) {
        int f=1;
        for (int[] w:arr) {
            for (int m:w) {
                f*=m;
            }
        }
        System.out.println("factoriyel = " + f);
    }
}
