public class Q01_AlphaCharactersCount {

    public static void main(String[] args) {

        // Task-> Find out how many alpha characters present in a string?
        // "heKL75jki8#"; ifdesindeki harf sayısını print eden code create ediniz.
        String str="heKL75jki8#";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (Character.isLetter(ch)){
                count++;
            }
        }
        System.out.println("1.yol");
        System.out.println("count = " + count);
        //2.yol
        System.out.println("2.yol");
        System.out.println(str.replaceAll("[^a-zA-Z]","").length());

/*


    Regular Expression
	.: Herhangi bir tek karakteri temsil eder
	(Yani '.' örneğin "a.b" dizesi, "acb", "aab" gibi "a" ve "b" harfleri arasında herhangi bir karakter içeren herhangi bir dizeyi eşleştirir).

	*: Önceki karakterin sıfır veya daha fazla kez tekrarlanmasını temsil eder
	(Yani 'a*' örneğin "a", "aa", "aaa" gibi "a" harfinin sıfır veya daha fazla kez tekrarlandığı dizeleri eşleştirir).

	+: Önceki karakterin bir veya daha fazla kez tekrarlanmasını temsil eder
	(Yani 'a+' örneğin "a", "aa", "aaa" gibi "a" harfinin bir veya daha fazla kez tekrarlandığı dizeleri eşleştirir).

	?: Önceki karakterin sıfır veya bir kez tekrarlanmasını temsil eder
	(Yani 'a?' örneğin "a" veya "" (boş dize) gibi "a" harfinin sıfır veya bir kez tekrarlandığı dizeleri eşleştirir).

	[]: Köşeli parantezler içinde belirli karakterlerin bir arada bulunmasını temsil eder
	(Yani '[abc]' örneğin "a", "b" veya "c" harflerinden herhangi birini içeren dizeleri eşleştirir).

	[^]: Köşeli parantezler içinde belirli karakterlerin dışında olan herhangi bir karakteri temsil eder
	(Yani '[^abc]' örneğin "a", "b" veya "c" harfı dışındaki karakterleri içeren dizeleri eşleştirir).

	\: Kaçış karakteri olarak kullanılır. Özel anlam taşıyan bir karakteri normal bir karakter olarak kabul ettirir
	(Yani '.' örneğin '.' karakterini eşleştirir, normal bir metakarakter olarak değil).

	|: "Veya" işlemini temsil eder. İki deseni veya karakteri seçer
	(Yani "a|b" örneğin "a" veya "b" harfini eşleştirir).

	^: Metnin başlangıcını temsil eder
	(Yani '^abc' örneğin "abc" ile başlayan dizeleri eşleştirir).

	$: Metnin sonunu temsil eder
	(Yani 'abc$' örneğin "abc" ile biten dizeleri eşleştirir).
 */


    }

}
