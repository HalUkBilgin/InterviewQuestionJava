import java.util.Arrays;

public class Q44_PrintArray {
    //Task->
    // Create a method which takes String array as a parameter
    // and prints all the element

    public static void main(String[] args) {
        String arr[] = {"Yucel", "Ebru", "Saim", "Behide", "Semra"};
        printArray(arr);



    }//main sonu

    private static void printArray(String[] arr) {

        for (String avuc:arr ) {
            System.out.print(avuc+", ");
        }
    }
}//Class sonu
