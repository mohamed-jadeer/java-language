package fundamentals;

public class StringFormat {
	public static void main(String[] args){
		int num = 25;
		String str = "Hello";
		//System.out.println(num + " " + str);
		String newstr = String.format("%s NewString %d", num, str);
		System.out.println(newstr);
	}
}
