import java.util.Scanner;
public class HollowRectangle {

    Scanner sc = new Scanner(System.in);

    public static void RectanglePattern(int totrows, int tocol){
        for (int i = 1 ; i<=totrows ; i++){
            for (int j = 1 ; j<=tocol ; j++ ){
                if(i==1 || j==1 || i==totrows || j==tocol ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RectanglePattern(10,7);
    }
}

