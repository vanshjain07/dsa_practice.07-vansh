import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListBasicQuestions {
    public static void reverseAL(ArrayList<Integer> lname){
        for (int i =lname.size()-1 ; i>=0; i--) {
            System.out.print(lname.get(i)+" ");
        }
    }

    public static int FindMax(ArrayList<Integer> lname) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <lname.size(); i++) {
            if(lname.get(i)>max){
                max= lname.get(i);
            }
        }
        return max;
    }
    public static void SwapTwoNums(ArrayList<Integer> lname, int idx1, int idx2){
        int temp = lname.get(idx1);
        lname.set(idx1, lname.get(idx2));
        lname.set(idx2,temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lname = new ArrayList<>(List.of(16,44,10,1,3));
        System.out.println("ArrayList is");
        System.out.println(lname);
        System.out.println("Reversed ArrayList is");
        reverseAL(lname);
        System.out.println();
        System.out.println("Max in ArrayList is");
        int max = FindMax(lname);
        System.out.println(max);
        System.out.println();
        System.out.println("After swapping in ArrayList : ");
        SwapTwoNums(lname,4,2);
        System.out.println(lname);

        System.out.println();
        System.out.println("Sorted List");
        Collections.sort(lname);
        System.out.println(lname);
    }

}
