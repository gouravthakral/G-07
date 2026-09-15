package DSA.Week_02_Basics;

public class FixedSlidingWindowSum {
    public static int maxSubarraySum(int[] arr, int k) {
        if (arr == null || arr.length < k || k <= 0) {
            return 0;
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum: " + maxSubarraySum(arr, k));
    }
}
