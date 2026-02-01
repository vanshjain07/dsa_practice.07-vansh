public class DecToBin {
    public static int DecimalToBinary(int dec){
        int bin = 0;
        int lastdigit;
        int inc=1;
        while(dec>0){
            lastdigit = dec % 2;
            dec = dec / 2;
            bin += (lastdigit*inc);
            inc=inc*10;
        }
        return bin;
    }

    public static void main(String[] args) {
        int dec = 7;
        int bin = DecimalToBinary(dec);
        System.out.println(bin);
    }
}
