import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q36_AddedOrNotTask {


    /* Task->
    create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
     count how many duplicates we have find out what are the duplicated values

     1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
     kaç tane tekrarli eleman olduğunu  ve  yinelenen değerleri print eden code create ediniz.
     */


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);

        int tekrarliElemanSayisi = 0;

        Set<Integer> uniqeElemanlar =new HashSet<>();
        List<Integer> tekrarliElemanlar = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            boolean ekliMi =uniqeElemanlar.add(numbers.get(i)); //ekli olma durumunu uniqeElemanlarda var olmasidir
            if(!ekliMi){ // uniqe elemalara eklenmediyse o eleman duplicate tir
                tekrarliElemanSayisi++; // bu durumda duplicate sayisi 1 artar
                tekrarliElemanlar.add(numbers.get(i)); //duplicate olan bu eleman tekrarliElemanlar listesine eklenir
            }
        }
        System.out.println("tekrarliElemanSayisi = " + tekrarliElemanSayisi); //tekrarliElemanSayisi = 2
        System.out.println("tekrarliElemanlar = " + tekrarliElemanlar); //tekrarliElemanlar = [1, 3]



    }
}
