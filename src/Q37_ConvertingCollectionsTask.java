import java.util.*;

public class Q37_ConvertingCollectionsTask {

    // create an array of random numbers of size 10
    // convert that array into a list
    // convert list into set

    // 10 boyutunda rastgele sayılardan oluşan bir array oluştur
    // bu arrayi bir listeye dönüştür
    // listeyi sete çevir

    public static void main(String[] args) {

        Integer[] arr = new Integer[10];
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = rnd.nextInt(10);//0-10 arasinda deger atamasi icin parametre olarak 10 kullanildi
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("list = " + list);
        Set<Integer> set = new HashSet<>(list);
        System.out.println("set = " + set);

    }
}
