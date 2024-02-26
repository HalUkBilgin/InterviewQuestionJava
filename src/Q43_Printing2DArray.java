import java.util.Arrays;

public class Q43_Printing2DArray {

    // Task-> Print 2D String array using loops

    public static void main(String[] args) {
        String arr[][] = {{"Yucel", "Ebru", "Saim", "Behide", "Semra"}, {"Lead", "BA", "Scram master", "Qa", "PM"}};

        System.out.println("   *** without loop   ***   ");
        System.out.println(Arrays.deepToString(arr));//

        System.out.println("   *** with loop   ***   ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }

        }
    }
}
