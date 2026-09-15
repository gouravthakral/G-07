package DSA.Week_02_Basics;

public class TwoSumSorted {
    public static int[] findPair(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum == target) {
                return new int[]{numbers[left], numbers[right]};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 8, 11, 15};
        int target = 10;
        int[] pair = findPair(numbers, target);
        if (pair.length == 2) {
            System.out.println("Pair found: " + pair[0] + ", " + pair[1]);
        } else {
            System.out.println("No pair found");
        }
    }
}
