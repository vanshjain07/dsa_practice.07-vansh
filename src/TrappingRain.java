public class TrappingRain {
    public static void trappedwater(int[] arr){
        if(arr.length<=2){
            System.out.println("no water is trapped");
        }else{
            int n = arr.length;;
            int[] leftmax = new int[n];
            int[] rightmax = new int[n];
            leftmax[0]=arr[0];
            rightmax[n-1]=arr[n-1];
            int lmax = leftmax[0];
            for (int i = 1; i < n; i++) {
                if(arr[i]<lmax){
                    leftmax[i]=lmax;
                }else{
                    leftmax[i]=arr[i];
                    lmax = arr[i];
                }

            }
            int rmax = rightmax[n-1];
            for (int i = n-2; i>=0; i--) {
                if(arr[i]<rmax){
                    rightmax[i]=rmax;
                }else{
                    rightmax[i]=arr[i];
                    rmax=arr[i];
                }
            }
            int[] totalWaterTrapped = new int[arr.length];
            for (int i = 0; i < n; i++) {
                totalWaterTrapped[i]=(Math.min(leftmax[i],rightmax[i])-arr[i]);
            }
            int sumWater=0;
            for (int i = 0; i < n; i++) {
                sumWater+=totalWaterTrapped[i];
            }
            System.out.println("Total water trapped is : "+sumWater);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};
        trappedwater(arr);
    }


}
