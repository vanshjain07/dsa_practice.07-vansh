import java.util.*;
import java.util.Scanner;
public class Strings {
    public static void printLetters(String name){
        for (int i = 0; i <name.length() ; i++) {
            System.out.println(name.charAt(i));
        }
    }
    public static boolean palindrome(String str){
        for (int i = 0; i <str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        //Strings are immutable
//        String str1 = new String("xyz");
//
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("hi "+name);
//        System.out.println(name.length());
        //concatenation
//        String fname = "Vansh";
//        String lname = "Jain";
//        String fullname = fname+" "+lname;
////        System.out.println(fname.charAt(1));
////        printLetters(fullname);
//        String pal = "racecar";
//        System.out.println(palindrome(pal);
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if (s1 == s2) {
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if (s1 == s3) {
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("strings are not equal");
        }


    }
}
