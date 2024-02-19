public class Q01_ReverseString {
        /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */

    public static void main(String[] args) {
        //1.yol
        String str="All is well";
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        String reverse=sb.reverse().toString();
        System.out.println("StringBuilder ile: "+reverse);
        //2.yol
        String reverse1="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse1+=str.charAt(i);
        }
        System.out.println("String ile: "+reverse1);
        reverseString(str);

    }

    private static void reverseString(String str) {
        char[] arr=str.toCharArray();
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }
    }
}//class sonu
