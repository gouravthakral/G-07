package DSA.Week_03_SlidingWindow_Arrays.General;

import java.util.ArrayList;
import java.util.List;

public class IndexNegationTechnique {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        int[] copy = nums.clone();

        for (int i = 0; i < copy.length; i++) {
            int index = Math.abs(copy[i]) - 1;
            if (copy[index] < 0) {
                duplicates.add(Math.abs(copy[i]));
            } else {
                copy[index] = -copy[index];
            }
        }

        return duplicates;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappeared = new ArrayList<>();
        int[] copy = nums.clone();

        for (int i = 0; i < copy.length; i++) {
            int index = Math.abs(copy[i]) - 1;
            if (copy[index] > 0) {
                copy[index] = -copy[index];
            }
        }

        for (int i = 0; i < copy.length; i++) {
            if (copy[i] > 0) {
                disappeared.add(i + 1);
            }
        }

        return disappeared;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Duplicates: " + findDuplicates(arr1));

        int[] arr2 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Disappeared: " + findDisappearedNumbers(arr2));
    }
}
