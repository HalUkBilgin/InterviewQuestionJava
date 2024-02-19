import java.util.Arrays;
import java.util.Scanner;

public class Q12_DifferenceBetweenArray_LargestAndSmallestElements {
    /*
    Create a function that takes an array and the difference between the largest
    and the smallest numbers.
    Ask user to enter array elements.
    Girilen  bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını return eden  method create ediniz.
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Arrayin boyutunu giriniz");
        int boyut= input.nextInt();
        int[] arr=new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.println(i+".index elemani giriniz");
            arr[i]=input.nextInt();
        }
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Fark: "+(arr[arr.length-1]-arr[0]));

        //2.yol
        int buyuk=0;
        int kucuk=Integer.MAX_VALUE;
        for (Integer w:arr) {
            if (buyuk<w){
                buyuk=w;
            }
            if (kucuk>w){
                kucuk=w;
            }
        }
        System.out.println("buyuk = " + buyuk);
        System.out.println("kucuk = " + kucuk);
        System.out.println("Fark: "+(buyuk-kucuk));

    }
}