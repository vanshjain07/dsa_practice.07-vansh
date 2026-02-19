import java.util.*;
import java.util.Scanner;
public class largestString {
    public static void main(String[] args) {
        //compare to ignore case 'A' and 'a' treated same
        //compare to
        String fruits[] = {"apple", "mango", "banana","zungguzeng"};
        String largest = fruits[0];
        for (int i = 1; i <fruits.length ; i++) {
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
            else{
                largest=largest;
            }
        }
        System.out.println(largest);
    }
}

