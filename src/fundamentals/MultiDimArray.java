/*
 * Only first index is required to make multidimensional array declaration valid 
 * Observation on calling length field on different levels of a multi dimensional array
 * Arrays are objects of Special Type of class
 */

package fundamentals;

public class MultiDimArray {
	public static void main(String[] args){
		int[][][] arr = new int[2][][];
		int[][][] newarr = new int[2][3][4];
		int[] arr1 = {5,6};
		System.out.println("Length field on different level");
		System.out.println(newarr.length);
		System.out.println(newarr[1].length);
		System.out.println(newarr[0][1].length);
		System.out.println("arr:" + arr); // arr:[[[I@1540e19d
		System.out.println("newarr:" + newarr); // newarr:[[[I@677327b6
		System.out.println("arr1:" + arr1); // arr1:[I@14ae5a5
		MultiDimArray md = new MultiDimArray(); // fundamentals.MultiDimArray@7f31245a
		System.out.println("----------------------------");
		System.out.println(md);
	}
}
