import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
   /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
   public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Bir metin giriniz");
      String str= scan.nextLine();
      String[] arr=str.split("");
      System.out.println(Arrays.toString(arr));
      String output="";
       for (String s : arr) {
           int count = 0;
           for (String string : arr) {
               if (s.equals(string)) {
                   count++;
               }
           }
           if (!output.contains(s)) {
               output += s + "=" + count + ",";
           }
       }
      System.out.println("output = " + output);
   }
}
