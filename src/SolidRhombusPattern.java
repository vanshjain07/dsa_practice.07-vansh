public class SolidRhombusPattern {
    public static void RhombusSolid(int rows){
        for(int i = 1 ; i<=rows ; i++){
            for(int j=1 ; j<=rows-i ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=rows ; j++){
                System.out.print("*");
            }
            for(int j=1 ; j<=i-1 ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RhombusSolid(5);
    }
}
