import java.util.ArrayList;
import java.util.Arrays;

public class Q17_SpecialCharRemoveArray {
    /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */

    public static void main(String[] args) {
        ArrayList<String> money = new ArrayList<>(Arrays.asList("$11", "$-45", "$2","$35"));
        System.out.println(getSum(money));

    }//main sonu

    private static int getSum(ArrayList<String> money) {
        int toplam=0;
        for (String avuc:money) {
            toplam+=Integer.parseInt(avuc.replace("$",""));
        }
        if (toplam<0)return -1;
        else return toplam;

    }
}//Class sonu