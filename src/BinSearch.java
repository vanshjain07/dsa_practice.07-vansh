public class BinSearch {
    public static int BS(int[] arr , int key) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(key==arr[mid]){
                return mid;
            } else if (key>arr[mid]) {
                start = mid + 1;
            }else{
                end = end - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12,21,42,62,195,932};
        int idx = BS(arr,442);
        System.out.println(idx);
    }

}
