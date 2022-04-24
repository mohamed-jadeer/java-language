/**
 * Sum of int and double return double
 * If there is no value set against String, by default it is assigned to null(not value)
 * When String object which is null(not value) is sout, then it wont throw nullpointer exception
 */

package fundamentals;

public class IntDouble {
	static String str1;
	static String str2 = null;
	static String str3 = "null";
	public static void main(String[] args) {
		int x = 10;
		double y = 2.3;
		System.out.println(x+y);
		System.out.println(5+2.3);
		System.out.println("Hello");
        System.out.println("___________________________");
		String str;
		System.out.println(IntDouble.str1);
		System.out.println(IntDouble.str2);
		System.out.println(IntDouble.str3);
	}

}
