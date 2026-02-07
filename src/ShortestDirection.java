import java.util.Scanner;
import java.util.*;
public class ShortestDirection {
    public static void distance(String str){
        int x = 0 , y = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
            else{
                System.out.println("Incorrect pattern given");
            }

        }
        int sqdist = (x*x)+(y*y);
        double dist= Math.sqrt(sqdist);
        System.out.println(dist);

    }

    public static void main(String[] args) {
        String str="NSEEEEWSWENSKW";
        distance(str);
    }
}
