public class PrimeNthNumber {
    public static int PrimeCheck(int n){
        int flag = 0;
        for (int i = 2; i <= n/2; i++) {
            if((n%i)==0){
                flag = 1;
                break;
            }
        }
        return flag;
    }
    public static int[] printNthPrime(int n){
        int[] arr = new int[n];
        if(n==1){
            arr[0] = 2;
        } else if (n<=1) {
            System.out.println("Invalid Entry");
        }else{
            arr[0]=2;
            for (int i = 1; i < n; i++) {
                int lastnum = arr[i-1];
                lastnum++;
                while(PrimeCheck(lastnum)!=0){
                    lastnum++;
                }
                arr[i]=lastnum;
            }
        }
        return arr;

    }
    public static void PrintExactPrime(int[] arr){
        System.out.println(arr[arr.length-1]);
    }

    public static void main(String[] args) {
//        int isitprim = PrimeCheck(49);
//        System.out.println(isitprim);
        int[] arr = printNthPrime(10001);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        PrintExactPrime(arr);
    }
}
