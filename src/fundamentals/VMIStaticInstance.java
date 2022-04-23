package fundamentals;

class SuperClass {
	static int static_num = 23;
	int instance_num = 45;
	
	void display(){
		System.out.println("Instance Display from Parent");
	}
	
	static void display1(){
		System.out.println("Static Display from Parent");
	}
}

public class VMIStaticInstance extends SuperClass{
	static int static_num = 230;
	int instance_num = 450;
	
	public static void main(String[] args){
		VMIStaticInstance vm = new VMIStaticInstance();
		//vm.display();
		//vm.display1();
		System.out.println("------------------------------");
		//((SuperClass)vm).display();
		//((SuperClass)vm).display1();
		SuperClass sc = new VMIStaticInstance();
		VMIStaticInstance vmi = (VMIStaticInstance)sc;
		System.out.println(sc.static_num);
		System.out.println(sc.instance_num);
		System.out.println("------------------------------------------");
		System.out.println(vmi.static_num);
		System.out.println(vmi.instance_num);
	}
	
	void display(){
		System.out.println("Instance Display from Child");
	}
	
	static void display1(){
		System.out.println("Static Display from Child");
	}
}
