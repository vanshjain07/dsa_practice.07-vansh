import java.util.Scanner;
public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number you wish to run prime number check on : ");
        num = sc.nextInt();
        if (num==2){
            System.out.println("It is prime");
        }else{
            boolean isPrime = true;
            int mid = num/2;
            for (int i=2;i<=mid;i++){
                if (num%i==0){
                    isPrime = false;
                }
            }
            if(isPrime==true){
                System.out.println("Number is prime");
            }else{
                System.out.println("Number is composit");
            }
        }


    }
}
