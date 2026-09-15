package DSA.Week_03_SlidingWindow_Arrays.General;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Blueberry");

        String secondElement = list.get(1);
        System.out.println("Retrieved element at index 1: " + secondElement);

        list.set(2, "Blackberry");
        System.out.println("Updated element at index 2: " + list.get(2));

        list.remove(0);
        list.remove("Cherry");

        boolean containsBanana = list.contains("Banana");
        int indexOfBlueberry = list.indexOf("Blueberry");
        boolean isEmpty = list.isEmpty();

        System.out.println("Contains Banana: " + containsBanana);
        System.out.println("Index of Blueberry: " + indexOfBlueberry);
        System.out.println("Is list empty: " + isEmpty);
        System.out.println("Final list size: " + list.size());
        System.out.println("List contents: " + list);
    }
}
