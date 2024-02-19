import java.util.*;

public class Q38_SetTask {

    //  PART 1
    // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
    // and add all elements from ArrayList to Set

    // ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
    // ve tüm öğeleri ArrayList'ten Set'e ekleyin

    // PART 2
    // create a method that takes Set<Character> and varargs of char as parameters
    // and adds all chars to the set

    // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
    // ve tüm karakterleri sete ekleyin
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);
        arrList.add(20);
        arrList.add(50);
        Set<Integer> integerSet=new HashSet<>();
        listiSeteAta(arrList,integerSet);
        System.out.println("Listin elemanlarii aldiktan sonra set : "+integerSet);

        //bolum 2
        Set<Character> characterSet=new TreeSet<>();
        karakterleriSetYap(characterSet,'A','B','a','R','q','r');
        System.out.println("Char elemanlari aldiktan sonra set: "+characterSet);
    }

    private static void karakterleriSetYap(Set<Character> characterSet, Character... chars) {
        for (int i = 0; i < chars.length; i++) {
            characterSet.add(chars[i]);
        }
    }

    private static void listiSeteAta(ArrayList<Integer> arrList, Set<Integer> integerSet) {
        for (Integer w:arrList) {
            integerSet.add(w);
        }
    }
}




