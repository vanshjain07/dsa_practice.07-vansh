public class FloydsTruangle {
    public static void Floyd(int rows){
        int start = 1;
        for(int i = 1 ; i<=rows ; i++){
            for(int j = 1 ; j<= i ; j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Floyd(5);
    }
}
