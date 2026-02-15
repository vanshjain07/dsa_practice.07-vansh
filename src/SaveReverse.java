public class SaveReverse {
    public static void main(String[] args) {
        int num = 70904;
        int reverse = 0;
        int lastdigit;
        while(num>0){
            lastdigit = num%10;
            reverse = (reverse*10) + lastdigit;
            num = num/10;
        }
        System.out.println(reverse);

    }
}
