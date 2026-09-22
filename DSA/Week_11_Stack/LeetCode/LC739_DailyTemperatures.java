package DSA.Week_11_Stack.LeetCode;

import java.util.Arrays;
import java.util.Stack;

/**
 * LeetCode 739: Daily Temperatures
 * Given an array of integers temperatures represents the daily temperatures,
 * return an array answer such that answer[i] is the number of days you have to wait
 * after the ith day to get a warmer temperature. If there is no future day for which
 * this is possible, keep answer[i] == 0 instead.
 *
 * Approach:
 * Monotonic Decreasing Stack storing indices.
 * Iterate through temperatures: while current temp is greater than temp at stack top index,
 * pop the index and calculate days waited as (current_index - popped_index).
 *
 * Time Complexity: O(n) - each index is pushed and popped at most once
 * Space Complexity: O(n) for the stack
 */
public class LC739_DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevDayIndex = stack.pop();
                result[prevDayIndex] = i - prevDayIndex;
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] temps1 = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println("Input:  " + Arrays.toString(temps1));
        System.out.println("Output: " + Arrays.toString(dailyTemperatures(temps1))); // [1, 1, 4, 2, 1, 1, 0, 0]

        int[] temps2 = {30, 40, 50, 60};
        System.out.println("Input:  " + Arrays.toString(temps2));
        System.out.println("Output: " + Arrays.toString(dailyTemperatures(temps2))); // [1, 1, 1, 0]
    }
}
