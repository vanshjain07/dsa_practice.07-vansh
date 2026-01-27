public class ReverseOfNumber {
    public static void main(String[] args) {
        int num = 70904;
        int lastdigit;
        while (num>0){
            lastdigit=num%10;
            num = num/10;
            System.out.print(lastdigit);
        }
    }
}
