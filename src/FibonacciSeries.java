public class FibonacciSeries {
    public static int[] FibonacciGenerate(int n){
        int[] arr = new int[n];
        if (n==1){
            arr[0]=1;
            return arr;
        }else if(n==2){
            arr[0]=1;
            arr[1]=2;
            return arr;
        }else{
            arr[0] = 1;
            arr[1] = 2;
            for (int i = 2; i <n; i++) {
                arr[i]= arr[i-1] + arr[i-2];
            }
            return arr;
        }
    }
    public static void SumOfFib(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println();
        System.out.println("The sum is : "+sum);
    }


    public static void main(String[] args) {
        int[] newFib = FibonacciGenerate(10);
        for (int i = 0; i < newFib.length; i++) {
            System.out.println(newFib[i]);
        }
    }
}
