public class Q35_WrapperClassTask {
 /* Task->
     create a method that accepts an int
     and returns twice of that int
     overload this method with wrapper class: Integer

     int parametreli ve parametrenin 2 katını return eden method create ediniz.
     Bu methodu Wrapper class ile overload ediniz.
      */

    public static void main(String[] args) {
        int sayi=1453;
        System.out.println(tljMethod(sayi));
        Integer yas=38;
        System.out.println(tljMethod(yas));

    }

    private static int tljMethod(int sayi) {
        return sayi*2;
    }
    private static int tljMethod(Integer sayi) {
        return sayi*2;
    }
}//Class sonu

