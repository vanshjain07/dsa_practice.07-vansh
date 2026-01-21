public class ZeroOneTriangle {
    public static void zeroone(int rows) {
        for(int i = 1 ; i<=rows ; i++ ){
            for(int j = 1 ; j<=i ; j++){
                if((j+i)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zeroone(5);
    }
}
