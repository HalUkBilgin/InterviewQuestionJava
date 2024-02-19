import java.util.Scanner;

public class Q30_ExponentialNumber {
    //Task->
    // Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // Girilen taban ve us değerleri için sayının kuvvetini print eden code create ediniz.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir taban degri giriniz");
        int taban= input.nextInt();
        System.out.println("Bir us degeri giriniz");
        int uss= input.nextInt();
        System.out.println("****For ile****");
        int sonuc=1;
        for (int i = 1; i <=uss ; i++) {
            sonuc*=taban;
        }
        System.out.println("sonuc = " + sonuc);
        System.out.println("****Math classi ile****");
        int sonuc1= (int) Math.pow(taban,uss);
        System.out.println("sonuc1 = " + sonuc1);
    }
}
