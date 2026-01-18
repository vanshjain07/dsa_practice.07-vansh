public class HollowRhombusPattern {
    public static void HollowRhombus(int rows){
        for(int i = 1 ; i<=rows ; i++){
            for(int k=1 ; k<=rows-i ; k++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=rows ; j++){
                if(i==1 || j==1 || i==rows || j==rows){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void DiamondPattern(int rows){
        for(int i = 1 ; i<=rows ; i++){
            for(int j = 1 ; j<=rows-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=(2*i)-1 ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j<=rows-i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = rows ; i>=1 ; i--){
            for(int j = 1 ; j<=rows-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=(2*i)-1 ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j<=rows-i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        DiamondPattern(4);
    }
}
