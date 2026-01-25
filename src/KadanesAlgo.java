public class KadanesAlgo {
    public static void Kadane(int[] arr) {
        int max_so_far = 0;
        int max_ending_here = 0;
        for(int i = 0 ; i<arr.length ; i++){
            max_so_far+=arr[i];
            if(max_so_far<0){
                max_so_far=0;
            }
            if (max_ending_here<max_so_far){
                max_ending_here = max_so_far;
            }
        }
        System.out.println(max_ending_here);
    }

    public static void main(String[] args) {
        int[] arr={1,-2,6,-1,3};
        Kadane(arr);
    }
}
