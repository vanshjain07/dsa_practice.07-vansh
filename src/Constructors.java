public class Constructors {
    public static void main(String[] args) {
        Vidyarthi vansh = new Vidyarthi();

        vansh.name="Vanah";
        vansh.age = 21;
        vansh.Passwd = "070904";

        vansh.marks[0]=100;
        vansh.marks[1]=97;
        vansh.marks[2]=91;

        Vidyarthi atharv = new Vidyarthi(19);

        Vidyarthi soham = new Vidyarthi(vansh);
        soham.Passwd="xyx";
        vansh.marks[0]=89;
        System.out.println(soham.age);
        for (int i = 0; i <3; i++) {
            System.out.println(soham.marks[i]);
        }
    }
}
class Vidyarthi{
    String name;
    int age;
    String Passwd;
    int[] marks;

    Vidyarthi(){
        marks = new int[3];
        System.out.println("Mai vidyarthi hu");
    }
    Vidyarthi(String somename){
        marks = new int[3];
        this.name=somename;
    }
    Vidyarthi(int someNumber){
        marks = new int[3];
        this.age=someNumber;
    }

    //Shallow copy constructor
//    Vidyarthi(Vidyarthi v){
//        marks = new int[3];
//        this.name=v.name;
//        this.age=v.age;
//        this.marks = v.marks; //REFERENCE IS COPIED
//    }

    //Deep Copy constructor
    Vidyarthi(Vidyarthi v){
        marks = new int[3];
        this.name=v.name;
        this.age=v.age;
        for (int i = 0; i <3; i++) {
            this.marks[i]=v.marks[i];
        }
    }
}
