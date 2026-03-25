public class Inheritence {
    public static void main(String[] args) {
//        Fish shark = new Fish();
//        shark.breathe();
        Dog leo = new Dog();
        leo.colour="Golden";
        leo.legs=4;
        System.out.println(leo.legs);
        leo.eat();
    }
}
class Animal{
    String colour;
    void eat(){
        System.out.println(" eats ");
    }
    void breathe(){
        System.out.println(" Breathes ");
    }
}

//class Fish extends Animal{
//    int fins;
//    void swim(){
//        System.out.println("Swims in water");
//    }
//
//}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    void eat(){
        System.out.println("Eats pedigree");
    }
    String breed;
}
