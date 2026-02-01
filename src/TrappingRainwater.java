public class TrappingRainwater {

    public static void trappedWater(int[] arr) {

        // Edge case
        if (arr.length <= 2) {
            System.out.println("No water is trapped");
            return;
        }

        int n = arr.length;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Left max boundary
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        // Right max boundary
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        // Trapped water
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        System.out.println(totalWater);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 6, 3, 2, 5};
        trappedWater(arr);
    }
}
