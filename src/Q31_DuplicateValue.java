import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q31_DuplicateValue {
       /* Task->
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Girilen bir string için tekrarlanan karakterleri print eden code create ediniz.
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin= input.nextLine().replace(" ","");
        List<Character> output=new ArrayList<>();
        char[] arr=metin.toCharArray();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]&&!output.contains(arr[j])){
                    output.add(arr[j]);
                }
            }
        }
        System.out.println("List:"+output);
        String[] str=new String[output.size()];
        for (int i=0;i<output.size();i++) {
            str[i]= String.valueOf(output.get(i));
        }
        System.out.println("Array: "+Arrays.toString(str));
    }
}

