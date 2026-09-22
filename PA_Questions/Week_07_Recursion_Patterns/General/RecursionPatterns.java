package PA_Questions.Week_07_Recursion_Patterns.General;

import java.util.ArrayList;
import java.util.List;

public class RecursionPatterns {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static List<String> generateSubstrings(String str) {
        List<String> substrings = new ArrayList<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                substrings.add(str.substring(i, j));
            }
        }
        return substrings;
    }

    public static void generateSubsequences(String str, int index, String current, List<String> result) {
        if (index == str.length()) {
            result.add(current);
            return;
        }

        generateSubsequences(str, index + 1, current + str.charAt(index), result);
        generateSubsequences(str, index + 1, current, result);
    }

    public static void headRecursionPrint(int n) {
        if (n == 0) {
            return;
        }
        headRecursionPrint(n - 1);
        System.out.print(n + " ");
    }

    public static int tailRecursionFactorial(int n, int accumulator) {
        if (n <= 1) {
            return accumulator;
        }
        return tailRecursionFactorial(n - 1, n * accumulator);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci(6): " + fibonacci(6));

        String test = "abc";
        System.out.println("All substrings of 'abc': " + generateSubstrings(test));

        List<String> subsequences = new ArrayList<>();
        generateSubsequences(test, 0, "", subsequences);
        System.out.println("All subsequences of 'abc': " + subsequences);

        System.out.print("Head recursion (1 to 5): ");
        headRecursionPrint(5);
        System.out.println();

        System.out.println("Tail recursion factorial(5): " + tailRecursionFactorial(5, 1));
    }
}
