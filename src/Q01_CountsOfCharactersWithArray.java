import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
    /*
        Task-> Girilen bir String value için  herbir character'in sayisini print eden code create ediniz.
        Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
               abaa   ==> a=3  b=1
       */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam hele bişey cizikdiresen : ");
        String str = input.nextLine();//javaCAN
        String strArr[] = str.split("");//str nin "" e göre her bir parcası arr e eleman olarak atandı
        System.out.println("str = " + str);//
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));//

        String output = "";
        for (int i = 0; i < strArr.length; i++) {
            int count = 0;
            for (int j = 0; j < strArr.length; j++) {

                if (strArr[i] == strArr[j]) {

                    count++;
                }
            }
            if (!output.contains(strArr[i])) {
                output+=strArr[i]+ " = "+count+", ";
            }
        }
        System.out.println("output = " + output);
    }
}
