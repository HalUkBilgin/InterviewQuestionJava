import java.util.Scanner;

public class Q54_AlphabetCheck {

    public static void main(String[] args) {
        // Task->
        // Check if the character is among a-z or A-Z
        // girilen karakterin a-z or A-Z arasında olmasını kontrol eden code create ediniz
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir karakter giriniz");
        char ch=scan.next().charAt(0);
        if (Character.isLetter(ch)){
            System.out.println("girilen "+ch+" ALPHABET");
        }else System.out.println("girilen "+ch+" ALPHABET degil");
        //2.yol
        System.out.println((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')?
                "girilen "+ch+" ALPHABET":
                "girilen "+ch+" ALPHABET degil");
    }
}
