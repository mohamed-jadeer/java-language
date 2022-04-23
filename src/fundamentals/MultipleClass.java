/**
 * When compiled creates 3 class files
 * Fishs
 * Organisms
 * MultipleClass
 */

package fundamentals;

class Organisms{
    String name;

    Organisms(){
        this.name = "ORGANISM";
    }
    public void print() {
        System.out.println("Organism " + this.name);
    }
}

class Fishs extends Organisms {
    int fins;

    Fishs(){
        this.fins = 2;
        this.name = "FISH";
    }
    public void print() {
        System.out.print("Fish " + this.name + " ");
        System.out.println(this.fins);
    }
    public void fishMethod(){
        System.out.println("Fish MEthod");
    }
}

class MultipleClass {
    public static void main(String[] args) {
        //Organism org = new Organism();
        //Fish fsh = new Fish();
        Organisms org1 = new Fishs();
        //Fish fsh1 = (Fish)new Organism();
        Fishs fsh1 = (Fishs)org1;
        fsh1.print();
        org1.fishMethod();
        //fsh.print();
    }
}