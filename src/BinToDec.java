public class BinToDec {
    public static int BinaryToDecimal(int bin){
        int dec = 0;
        int lastdigit;
        int inc = 1;
        while(bin>0){
            lastdigit=bin%10;
            bin = bin / 10;
            dec = dec + (lastdigit*inc);
            inc = inc *2;
        }
        return dec;
    }

    public static void main(String[] args) {
        int bin = 10101;
        int ans = BinaryToDecimal(bin);
        System.out.println(ans);
    }
}
