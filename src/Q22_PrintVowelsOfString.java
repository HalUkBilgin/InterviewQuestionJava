import java.util.Scanner;

public class Q22_PrintVowelsOfString {
    // Task->
    // Get String from user and print just vowels(aeiou) inside String on the console
    // Girilen bir ifadenin sadece sesli harflerin print eden code create ediniz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("agam hele bi şeyler giresen : ");
        String bisey = input.nextLine();//javacanlara selam ->aaaaa e a
        System.out.println("   ***   amele code   ***   ");
        for (int i = 0; i < bisey.length(); i++) {
            if (bisey.charAt(i) == 'a' || bisey.charAt(i) == 'e' ||
                    bisey.charAt(i) == 'u' || bisey.charAt(i) == 'o' || bisey.charAt(i) == 'i') {

                System.out.print(bisey.charAt(i) + " ");
            }
        }
        System.out.println();//dumy
        System.out.println("   ***   cincix code   ***   ");
        System.out.println(bisey.replaceAll("[^aeiuo]", ""));

    }

}
