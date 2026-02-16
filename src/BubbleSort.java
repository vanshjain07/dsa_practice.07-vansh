public class BubbleSort {
    public static void Bubble(int[] arr){
        int n = arr.length;
        for (int i = 0; i <n-1; i++) {
            for (int j = i+1; j <n; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {15,6,7,2,16,8};
        Bubble(arr);
    }
}
