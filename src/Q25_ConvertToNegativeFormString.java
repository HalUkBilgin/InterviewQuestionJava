import java.util.Arrays;

public class Q25_ConvertToNegativeFormString {
    /*  Task->
      Convert the given Array to negative form sentence into a String.

      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

      Output:
      String output ="JavaIsNOTDifficult";
       */

    public static void main(String[] args) {
        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        String str="";
        for (int i = 0; i < arr.length; i++) {//arr elemanlarının her biri tekara alındı
            str+=arr[i];//tekrardakiher bir array elamanı str'e concat edildi
        }
        System.out.println("str : "+str);

        System.out.println(str.replace("Is", "IsNOT"));// JavaIsNOTDifficult
    }
}
