/*
 * Order of execution of blocks during an object initialization
 * First call
Parent Static
Child static
Parent Instance
Parent Constructor
Child Instance
Child Constructor
---------------------------------------
* Subsequent calls
Parent Instance
Parent Constructor
Child Instance
Child Constructor
 */

package fundamentals;

class Organism{
    
    Organism(){
    	System.out.println("Parent Constructor");
    }
    static{
    	System.out.println("Parent Static");
    }
    {
    	System.out.println("Parent Instance");
    }
}

class Fish extends Organism {
    int fins;
    static{
    	System.out.println("Child static");
    }
    {
    	System.out.println("Child Instance");
    }
    
    Fish(){
    	System.out.println("Child Constructor");
    }
}

class BlockLevelExec {
    public static void main(String[] args) {
        Fish fsh = new Fish();
        System.out.println("---------------------------------------");
        Fish fsh2 = new Fish();
    }
}