import java.util.Scanner;

public class Q39_UseContinue {

        /* Task->
         Girilen bir stringin harflerini bosluk veya a harfi hariç teker teker  alt alta print eden code create ediniz.
         */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gakgom ele bişey girisin : ");
        String str = input.nextLine();//javaCAN'a selam
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '|| str.charAt(i) == 'a'){//girilen str herbir tekrarın " " veya a olma sartı
                continue;//if true ise loop step action almadan sonraki stepe geçecek
            }else System.out.println(str.charAt(i));
        }
    }
}
