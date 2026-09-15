package DSA.Week_07_Recursion_Patterns.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC401_BinaryWatch {
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> times = new ArrayList<>();

        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    times.add(String.format("%d:%02d", h, m));
                }
            }
        }

        return times;
    }

    public static void main(String[] args) {
        int turnedOn = 1;
        System.out.println("Possible times for turnedOn = 1: " + readBinaryWatch(turnedOn));
    }
}
