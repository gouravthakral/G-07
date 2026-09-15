package DSA.Week_05_Sorting.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC2418_SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = map.get(heights[n - 1 - i]);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        String[] sorted = sortPeople(names, heights);
        System.out.println("Sorted people: " + Arrays.toString(sorted));
    }
}
