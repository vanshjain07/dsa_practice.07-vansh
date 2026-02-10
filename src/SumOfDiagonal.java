import java.util.Scanner;
import java.util.*;
public class SumOfDiagonal {
    public static void DiagonalSUm(int[][]matrix) {
//        //number of rows and columns
        int m = matrix.length;
        int PriSum = 0;
        int SecSum = 0;
//        //for Primary Sum
//        for (int i = 0; i <m; i++) {
//            for (int j = 0; j <m; j++) {
//                if(i==j){
//                    PriSum+=matrix[i][j];
//                }
//            }
//        }
//        //for secondary sum
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j <m ; j++) {
//                if(j==(m-i-1)){
//                    SecSum+=matrix[i][j];
//                }
//            }
//        }
//        int totSum= PriSum+SecSum;
//BETTER APPROACH
        for (int i = 0; i < m; i++) {
            PriSum += matrix[i][i];
            SecSum += matrix[i][m - 1 - i];
        }

        int totSum = PriSum + SecSum;

        // Avoid double-counting center for odd-sized matrix
        if (m % 2 == 1) {
            totSum -= matrix[m / 2][m / 2];
        }


        System.out.println("The sume of diagonals is : "+totSum);
    }

    public static void main(String[] args) {
        int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        DiagonalSUm(matrix);
    }
}
