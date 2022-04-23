package fundamentals;

public class SyntaxChecks {
	public static void main(String[] args){
		int[] x = {1,2};
		int []y = {3,4};  // Valid syntax
		int z[] = {3,4};
		int[] arr = new int[3];
		
		int[][] arr1 = {{1,2},{3,4},{5,6}};
		for(int[] numarr: arr1){
			for(int num : numarr){
				System.out.println(num);
			}
		}
		System.out.println("---------------------------");
		for(int i:arr){
			System.out.println(arr[i]);
		}
	}
	
	void sum(int z, int... x){
		System.out.println("");
	}
}

/*
private class Test{
	void display(){
		System.out.println("Hello");
	}
}*/
