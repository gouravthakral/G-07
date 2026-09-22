package PA_Questions.Week_04_Searching_SlidingWindow.General;

public class CountValidSubarrays {
    public static int countSubarraysWithSumLessThanOrEqualTo(int[] nums, int limit) {
        int left = 0;
        int currentSum = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            while (left <= right && currentSum > limit) {
                currentSum -= nums[left];
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int limit = 5;
        System.out.println("Valid subarrays count: " + countSubarraysWithSumLessThanOrEqualTo(nums, limit));
    }
}
