import java.util.ArrayList;
public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> lname = new ArrayList<>();
        lname.add(1);  //O(1)
        lname.add(44);
        System.out.println(lname);
        System.out.println(lname.get(1));  //O(1)
        lname.remove(1);  //O(n)
        System.out.println(lname);

        lname.add(2);
        lname.add(4);
        System.out.println(lname);
        lname.set(1,44); //O(n)
        System.out.println(lname);

        System.out.println(lname.contains(434)); //O(n)

        lname.add(1,16);
        System.out.println(lname);

        System.out.println(lname.size());
    }

}
