/**
 * When int and long is multiplied long value is returned
 */

package fundamentals;

public class IntLong {

	public static void main(String[] args) {
		int i = 12345, l;  //  range is from  -2,147,483,648 to  2,147,483,647 (31 bits used for storing value and 1 for sign)
		long j = 182057, k;
		k = i*j; // k = 2,247,493,665
		//l = i*j; // compilation error
		System.out.println(k);
		System.out.println((int)k);
	}

}
