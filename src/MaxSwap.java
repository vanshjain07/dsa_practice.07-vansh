public class MaxSwap {
    public static void main(String[] args) {
        String s = "1000000011111111110111010111101010010101010011110000111";
        int maxSwaps = 5;
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        int swaps = 0;

        while (i < j && swaps < maxSwaps) {
            while (i < j && arr[i] == '0') i++;
            while (i < j && arr[j] == '1') j--;
            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                swaps++;
                i++;
                j--;
            }
        }

        System.out.println("Final binary string: " + new String(arr));
        System.out.println("Swaps used: " + swaps);
    }
}
