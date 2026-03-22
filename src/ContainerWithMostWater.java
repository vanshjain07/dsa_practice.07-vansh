import java.util.ArrayList;
import java.util.List;

public class ContainerWithMostWater {
    public static void BruteForceTechnique(ArrayList<Integer> lname){
        int temp = 0;
        int max = 0;
        for (int i = 0; i <lname.size(); i++) {
            for (int j = i+1; j < lname.size(); j++) {
                temp=Math.min(lname.get(i), lname.get(j))*(j-i);
                if (max<temp){
                    max = temp;
                }
            }
        }
        System.out.println(max);
    }

    public static void TwoPointerApproach(ArrayList<Integer> list){
        int temp = 0;
        int max = 0;
        int leftpointer = 0;
        int rightpointer = list.size()-1;
        while(leftpointer<=rightpointer){
            temp = Math.min(list.get(leftpointer),list.get(rightpointer))*(rightpointer-leftpointer);
            if(list.get(leftpointer)<list.get(rightpointer)){
                leftpointer++;
            }else{
                rightpointer--;
            }
            if (max<temp){
                max = temp;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lname = new ArrayList<>(List.of(1,8,6,2,5,4,6,3,7));
        BruteForceTechnique(lname);
        System.out.println();
        TwoPointerApproach(lname);

    }
}
