import java.util.ArrayList;
import java.util.List;

public class MultiDimAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(2,4,6,8,10));
        ArrayList<Integer> list3 = new ArrayList<>(List.of(3,6,9,12,15));
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);
        System.out.println("Each list separately");
        for (int i = 0; i<mainlist.size(); i++) {
            System.out.println(mainlist.get(i));
        }
        System.out.println();
        System.out.println("Each element printing");
        for (int i = 0; i<mainlist.size(); i++) {
            for (int j = 0; j <mainlist.get(i).size(); j++) {
                System.out.print(mainlist.get(i).get(j)+" ");
            }
        }


    }
}
