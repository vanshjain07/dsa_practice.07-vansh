public class MaxSubarraySum {

    public static int BruteForce(int[] arr){
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int jodna = 0;
                for (int k = i; k <= j ; k++) {
                    jodna+=arr[k];
                }
                if (jodna>sum){
                    sum = jodna;
                }
            }
        }
        return sum;
    }

    public static int PrefixSum(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0]=arr[0];
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        int insum ;
        for (int i = 0; i <prefix.length; i++) {
            for (int j =i; j <prefix.length; j++) {
                if(i==0){
                    insum = prefix[j];
                }else{
                    insum = prefix[j]-prefix[i-1];
                }

                if(insum>sum){
                    sum=insum;
                }
            }
        }
        return sum;
    }

    public static int KadensAlgo(int[] arr){
        int globalsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if(currsum<0){
                currsum = 0;
            }
            if(currsum>globalsum){
                globalsum = currsum;
            }
        }
        return globalsum;
    }

    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int MaxSubarraySum = KadensAlgo(arr);
        System.out.println(MaxSubarraySum + " BY KADENS ALGO");
        int PrefSumMethod = PrefixSum(arr);
        System.out.println(PrefSumMethod + " BY PREFIX SUM");

    }
}
