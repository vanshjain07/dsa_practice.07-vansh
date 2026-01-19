public class LinearSearch {
    public static void LinSearch(int[] arr, int key){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                System.out.println("Yes, element is found. The index is : "+ i);
                j = 1;
            }
        }
        if (j==0){
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,42,145,75,24};
        LinSearch(arr , 759);
    }

}
