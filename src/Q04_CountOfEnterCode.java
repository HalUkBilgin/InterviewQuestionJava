import java.util.Scanner;

public class Q04_CountOfEnterCode {
    //  Task-> STRING OLAN PIN kodunu 3 seferde  kontrol eden code create ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pin = "javvaNURjavaNAZjavaSU";
        int girilenHak=3;
        boolean bl=true;
        while (true){
            System.out.println("Pin kodunu gir");
            String kPin=input.nextLine();
            if(pin.equals(kPin)){
                System.out.println("Pin kodu dogru devam et");
                break;
            }else {
                System.out.println("Hatali pin girdiniz");
                girilenHak--;
                System.out.println("Kalan hak: "+girilenHak);
            }
            if (girilenHak==0){
                System.out.println("Tel kapandi pini bilemedin");
                break;
            }
        }
    }
}
