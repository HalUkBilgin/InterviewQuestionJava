import java.util.Scanner;

public class Q60_SumWithoutLoop {
   /*
   Task-> girilen sayıya kadar olan pozitif tamsayıların toplamını loop kullanmadan print eden code create ediniz.
    */


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        loopTopla(sayi);
        System.out.println("Loop kullanmadan toplam: "+loopsuzToplam(sayi));



    }//main sonu

    private static int loopsuzToplam(int sayi) {
        if(sayi>0){
            return sayi+loopsuzToplam(sayi-1);
        }else return sayi;
    }

    private static void loopTopla(int sayi) {
        int toplam=0;
        for (int i = 1; i <=sayi ; i++) {
            toplam+=i;
        }
        System.out.println("Loop ile toplam: "+toplam);
    }
}
