import java.util.Scanner;

public class FactorialOfANum {

    public static int Fact(int a){
        if(a==1){
            return 1;
        } else if (a==0) {
            return 0;
        }else{
            return a*Fact(a-1);
        }
    }
    public static int BinomialCoefficient(int n , int r){
        return (Fact(n))/(Fact(r)*Fact(n-r));
    }

    public static void IsItPrime(int num) {
        boolean isPrime = true;
        for (int i = 2 ; i<=Math.sqrt(num); i++){
            if(num%i==0){
                isPrime = false;
            }
        }
        if(isPrime==true){
            System.out.println("Its a primeeee Numberrr!! wooohooo");
        }else{
            System.out.println("Composit nikla bcccc");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check prime condition for");
        int a = sc.nextInt();
        IsItPrime(a);
    }
}
