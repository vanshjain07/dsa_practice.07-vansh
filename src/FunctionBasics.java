import java.util.Scanner;

public class FunctionBasics {
    public static void SwapIt(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.print(a +" "+b);
    }
    public static int Multi(int a , int b){
        return a*b;
    }

    public static void main(String[] args) {
        int a = 45;
        int b = 32;
        int product = Multi(a,b);
        System.out.println(product);
    }
}
