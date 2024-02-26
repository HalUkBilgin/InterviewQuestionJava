import java.util.Scanner;

public class Q19_UsingDoWhilePrintNumber {
    /* Task->
        create one int
        do while int is less then 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
        100'e kadar 5 artan doğal sayıları print eden do-while code create ediniz.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("agam bi sayı giresen : ");
        int sayi = input.nextInt();
        do {
            System.out.print(sayi+" ");
            sayi+=5;
        }while (sayi<100);



    }
}
