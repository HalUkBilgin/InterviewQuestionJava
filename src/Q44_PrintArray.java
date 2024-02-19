public class Q44_PrintArray {
    //Task->
    // Create a method which takes String array as a parameter
    // and prints all the element

    public static void main(String[] args) {
        String  arr[]={"sefil haluk","serap Lead","aytekin master","boos mustafa"};
        printArrStr(arr);
    }

    private static void printArrStr(String[] arr) {
        for (String w:arr) {
            System.out.print(w+" ");
        }
    }
}
