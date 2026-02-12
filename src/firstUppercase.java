import java.util.Scanner;
import java.util.*;
public class firstUppercase {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i <str.length() ; i++) {
            if (str.charAt(i-1)==' '){
                char n = Character.toUpperCase(str.charAt(i));
                sb.append(n);
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am vansh";
        System.out.println(toUpperCase(str));
    }

}
