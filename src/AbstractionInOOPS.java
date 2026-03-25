public class AbstractionInOOPS {
    public static void main(String[] args) {
//        Horse h = new Horse();
//        h.walk();
//        h.eat();
//        Chicken ch = new Chicken();
//        ch.walk();
//        ch.eat();
//        System.out.println();
//        System.out.println(h.color);
//
//        h.changeColour();
//
//        System.out.println(h.color);

        Mustang m = new Mustang();
    }
}

abstract class Janvar{
    String color;
    Janvar(){
//        color = "Black";
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Janvar{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColour(){
        color = "DarkBrown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Janvar{
    void changeColour(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("wals on two legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}