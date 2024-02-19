import java.util.Arrays;

public class Q43_Printing2DArray {

    // Task-> Print 2D String array using loops

    public static void main(String[] args) {
        String arr[][] = {{"zeynep", "Aytekin", "Furkan", "Serap"}, {"Qa", "Developer", "PM", "Sm"}};
        for (String[] w:arr) {
            for (int i = 0; i < w.length; i++) {
                System.out.print(w[i]+" ");
            }
        }

    }
}
