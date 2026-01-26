public class InvertedRotatedHP {
    public static void main(String[] args) {
        int rows  = 5;
        for(int i = 1 ; i<=rows ; i++){
            for(int j = rows ; j>0 ; j--){
                if (j>=i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
