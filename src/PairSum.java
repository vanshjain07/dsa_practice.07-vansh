import java.util.ArrayList;
import java.util.List;

public class PairSum {
    public static void Brute(ArrayList<Integer> lname, int target){
        for (int i = 0; i < lname.size(); i++) {
            for (int j = i+1; j < lname.size(); j++) {
                if((lname.get(i)+lname.get(j))==target){
                    System.out.println("The pairs are "+lname.get(i)+" and "+lname.get(j));
                }
            }
        }
    }
    public static void TPapproach(ArrayList<Integer> lname, int target){
        int lp = 0;
        int rp = lname.size()-1;
        while(lp<rp){
            if((lname.get(lp)+lname.get(rp))>target){
                rp--;
            } else if ((lname.get(lp)+lname.get(rp))==target) {
                System.out.println(lname.get(lp)+" "+lname.get(rp));
                break;
            }else{
                lp++;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        Brute(list,5);
        System.out.println();
        TPapproach(list,5);
    }
}
