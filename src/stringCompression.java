import java.util.*;
public class stringCompression {
    public static String toCompress(String str){
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int count = 1;
            while(i+1<str.length()&&str.charAt(i+1)==ch){
                count++;
                i++;
            }
            sb.append(ch);
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaabbbccccd";
        System.out.println(toCompress(str));
        String str1 = "abcd";
        System.out.println(toCompress(str1));
    }
}
