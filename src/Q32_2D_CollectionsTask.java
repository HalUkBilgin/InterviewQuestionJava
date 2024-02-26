import java.util.ArrayList;
import java.util.Arrays;

public class Q32_2D_CollectionsTask {
    // Create 2D ArrayList which can store String ArrayLists
    // Create 3 ArrayLists which are Employees, Employers, Companies
    // Store this 3 ArrayList in 2D ArrayList

    // String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    // Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    // Bu 3 ArrayList'i 2D ArrayList'te saklayın
    //[[Ahmet, Ali, Emrah, Elif, tecnical support], [Haluk, Eylul, Yusuf, Can, İbrahim, Mehmet], [Amazon, Google, Testinium, IBM]]


    public static void main(String[] args) {
        ArrayList<String> calisanlar = new ArrayList<>(Arrays.asList("Ahmet", "Ali", "Emrah", "Elif", "Sema"));
        ArrayList<String> isVerenler = new ArrayList<>(Arrays.asList("Saliha", "Elif", "İpek", "Semra", "Yucel"));
        ArrayList<String> sirketler = new ArrayList<>(Arrays.asList("amazon", "google", "clarusway", "IBM", "microsoft"));
        ArrayList<ArrayList<String>> listeler = new ArrayList<>();
        listeler.add(calisanlar);
        listeler.add(isVerenler);
        listeler.add(sirketler);

        System.out.println("calisanlar = " + calisanlar);//[Ahmet, Ali, Emrah, Elif, Sema]
        System.out.println("isVerenler = " + isVerenler);//[Saliha, Elif, İpek, Semra, Yucel]
        System.out.println("sirketler = " + sirketler);//[amazon, google, clarusway, IBM, microsoft]
        System.out.println("listeler = " + listeler);//[[Ahmet, Ali, Emrah, Elif, Sema], [Saliha, Elif, İpek, Semra, Yucel], [amazon, google, clarusway, IBM, microsoft]]
        System.out.println("listeler.get(0) = " + listeler.get(0));//[Ahmet, Ali, Emrah, Elif, Sema]
        System.out.println("isVerenler.get(0) = " + isVerenler.get(0));// Saliha

    }
}

