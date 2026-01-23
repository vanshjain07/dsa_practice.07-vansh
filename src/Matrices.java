import java.util.*;
import java.util.Scanner;
public class Matrices {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nummber of rows:");
        int n = sc.nextInt();
        System.out.println("Enter nummber of columns:");
        int m = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter the element for place"+"["+i+"]"+"["+j+"]");
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Your matrix is : ");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
