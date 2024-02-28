public class Task19 {
    public static void main(String[] args) {
        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr2.length; k++) {
                if (i == k)
                    for (int j = 0; j < arr1[i].length; j++) {
                        for (int l = 0; l < arr2[k].length; l++) {
                            if (j == l) {
                                sum += arr1[i][j] + arr2[k][l];
                            }
                        }
                    }
            }
        }
        System.out.println(sum);
    }
}
