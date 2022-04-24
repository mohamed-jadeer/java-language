package fundamentals;
import java.util.Scanner;
public class PyramidPattern {
	public static void main(String[] args){
		System.out.println("Height of the pyramid required : ");
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		sc.close();
		for(int i=0 ; i <  height ; i++){
			for(int j = 0 ; j < ((height*2)-1) ; j++){
				if((j<((height-1)-i)) || ((j>(height-1)+i))){
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
