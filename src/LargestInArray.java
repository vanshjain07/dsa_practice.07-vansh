public class LargestInArray {
    public static int LargestInArr(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest) {
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {12,41,4,52,33,69,21,7};
        int largest = LargestInArr(arr);
        System.out.println(largest);
    }
}
