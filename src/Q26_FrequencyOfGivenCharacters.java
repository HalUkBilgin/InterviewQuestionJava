public class Q26_FrequencyOfGivenCharacters {
	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı)  print eden   METHOD create ediniz..

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */


    public static void main(String[] args) {




        // String str = "AAABBCDD";
        String str = "ey edip adanada pide ye";

        frekans(str);


    }//main sonu

    private static void frekans(String str) {


        String output="";//A+harfSayisi+B+harfSayisi
        for (int i = 0; i < str.length(); i++) {//i-> kıyas edilen harf
            int harfSayisi=0;
            for (int j = 0; j < str.length(); j++) {//j-> kıyas eden harf
                if (str.substring(i,i+1).equals(str.substring(j,j+1))){
                    harfSayisi++;
                }
            }
            if (!output.contains(str.substring(i,i+1))){//tekrardan gelen harf outputta yoksa
                output+=str.substring(i,i+1)+harfSayisi;
            }


        }

        System.out.println("output = " + output);

    }

}//Class sonu
