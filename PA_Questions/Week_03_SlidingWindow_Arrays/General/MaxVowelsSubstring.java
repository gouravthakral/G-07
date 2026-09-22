package PA_Questions.Week_03_SlidingWindow_Arrays.General;

public class MaxVowelsSubstring {
    private static boolean isVowel(char ch) {
        char c = Character.toLowerCase(ch);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static int maxVowels(String s, int k) {
        int currentVowels = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }

        int maxVowels = currentVowels;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
            if (isVowel(s.charAt(i - k))) {
                currentVowels--;
            }
            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println("Max vowels in substring: " + maxVowels(s, k));
    }
}
