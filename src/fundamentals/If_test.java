package fundamentals;

import java.util.Scanner;

class If_test {
	public static void main(String[] args){
		double fn, sn, ans;
		System.out.println("Hello World!");
		Scanner readbuf = new Scanner(System.in);
		System.out.print("Enter Your First Number: ");
		fn = readbuf.nextDouble();
		System.out.print("Enter Your Second number: ");
		sn = readbuf.nextDouble();
		ans = fn + sn;
		System.out.println("Sum of the numbers is " + ans);
		if(fn > sn){
			System.out.println(fn + " is the largest");
		}
		else{
			System.out.println(sn + " is the largest");
		}
		readbuf.close();
	}
}
