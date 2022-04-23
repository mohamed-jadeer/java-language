/*
 * Return Types and values of different operators
 * Overriding toString method from Object class
 * Outputting String reference variable declared in various ways
 */

package fundamentals;

public class AssignementReturn {
	static String str1 = new String();
	static String str2;
	public static void main(String[] args){
		int x = 129, y=10;
		boolean b;
		b = (y == x); // throws error if given as y=x
		System.out.println("Boolean Result is : " + b);
		System.out.println("Assignment Return type : " + (y=x));  // returns 129(value of x)
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println("Addition Return type : " + (x+y));  // returns 139
		System.out.println("Modular Return type : " + (x%y));   // returns 9
		System.out.println("------------------------------------------------");
		AssignementReturn ar = new AssignementReturn();
		System.out.println(ar);
		System.out.println("---------------------------------------------");
		System.out.println(AssignementReturn.str1);
		System.out.println("---------------------------------------------");
		System.out.println(AssignementReturn.str2);
		System.out.println("---------------------------------------------");
		String str3 = null;
		System.out.println(str3);
	}
	@Override
	public String toString() {
		return "Overrided String";
	}

}
