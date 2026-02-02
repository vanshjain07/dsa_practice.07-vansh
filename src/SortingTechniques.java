import java.util.Arrays;
public class SortingTechniques {
    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i<n-1 ; i++){
            for(int j = 0 ; j<n-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i = 0; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void SelectionSort(int[] arr) {
        for(int i = 0 ; i<arr.length-2;i++){
            int min = i;
            for(int j = i+1 ; j< arr.length;j++){
                if (arr[j]<min){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            System.out.println();
            arr[i]=temp;
        }
        for(int i = 0; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void InsertionSort(int[] arr) {
        for(int i = 1 ; i < arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        for(int k = 0; k< arr.length ; k++){
            System.out.print(arr[k]+" "); 
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        Arrays.sort(arr);
        for(int k = 0; k< arr.length ; k++){
            System.out.print(arr[k]+" ");
        }

    }
}
