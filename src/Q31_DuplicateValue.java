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
        System.out.println("Gakgom ele bişey girisin : ");
        String str = input.nextLine();
        System.out.println("str = " + str);//
        ArrayList<Character> tekrarlananChar = new ArrayList<>();//tekrarlanan karakterleri depolanacagı bos list tanımlandı
        char[] charArr = str.toCharArray();//str nin herbir karakteri charArr elemaı olarak atandı.
        System.out.println("Arrays.toString(charArr) = " + Arrays.toString(charArr));//

        for (int i = 0; i < charArr.length; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[i] == charArr[j] && !tekrarlananChar.contains(charArr[j])) {
                    tekrarlananChar.add(charArr[j]);
                }
            }
        }
        System.out.println("tekrarlananChar = " + tekrarlananChar);//
    }
}

