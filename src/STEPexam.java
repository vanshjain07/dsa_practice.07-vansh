public class STEPexam { 
    public static void main(String[] args) {
        int[] arr = new int[30];
        int a = 3;
        arr[0] = a;

        for (int i = 1; i < 30; i++) {
            arr[i] = arr[i - 1] + i;
        }

        System.out.println("Series:");
        for (int i = 0; i < 30; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("nums in arr[i-1] arr[i] arr[i+1] arent prime:");
        int sum = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            if (!isPrime(arr[i - 1]) && !isPrime(arr[i]) && !isPrime(arr[i + 1])) {
                System.out.print(arr[i] + " ");
                sum += arr[i];
            }
        }

        System.out.println("\nSum: " + sum);
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
