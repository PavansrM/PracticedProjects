package PracticePrograms;

import java.util.ArrayList;

public class ArraylistIteration {

    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Add elements to the ArrayList
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);

        // Iterate over the elements using a for loop
        System.out.println("Iterating using a for loop:");
        for (int i = 0; i < numbersList.size(); i++) {
            int element = numbersList.get(i);
            System.out.println("Element at index " + i + ": " + element);
        }

        // Iterate over the elements using an enhanced for loop (for-each loop)
        System.out.println("\nIterating using an enhanced for loop:");
        for (int number : numbersList) {
            System.out.println("Element: " + number);
        }
    }
}
