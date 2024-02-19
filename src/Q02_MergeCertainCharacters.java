import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /* Task->
     * Girilen  Stringin ilk ve son harfini yine girilen  sayi kadar
     * return eden metod create ediniz.
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String str= input.nextLine();
        System.out.println("Ilk ve son harfi kac defa yazdirayim");
        int sayi= input.nextInt();
        System.out.println(ilkSonYazdir(str,sayi));

    }//main sonu

    private static String ilkSonYazdir(String str, int sayi) {
        String output="";
        for (int i = 0; i < sayi; i++) {
            //output+=""+str.charAt(0)+str.charAt(str.length()-1);
            output+=str.substring(0,1)+str.substring(str.length()-1);
        }
        return output;
    }
}//class sonu
