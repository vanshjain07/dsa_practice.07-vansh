public class ButterflyPattern {
    public static void Butterfly(int rows) {
        for(int i = 1 ; i<=rows ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            for (int k = 1 ; k<=(2*rows)-(2*i) ; k++){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1 ; i<=rows ; i++){
            for (int j = 1 ; j<=rows-i+1 ; j++){
                System.out.print("*");
            }
            for (int k = 1 ; k<=(2*i)-2 ; k++){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=rows-i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Butterfly(4);
    }
}
