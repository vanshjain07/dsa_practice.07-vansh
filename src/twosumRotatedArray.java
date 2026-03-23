import java.util.ArrayList;
class twosumRotatedArray {
    public static void twosum(ArrayList<Integer> list, int d){
        int target = 0;
        int flag = 0;
        for(int i = 0 ; i<list.size(); i++){
            target = d - list.get(i) ;
            if((list.contains(target))==true){
                flag = 1;
                System.out.println("The pairs are "+list.get(i)+" & "+ target);
                break;
            }
        }
        if(flag==0){
            System.out.println("The pairs are not found ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int d = 20;

        twosum(list,d);


    }
}