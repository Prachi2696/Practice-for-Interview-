package com.example.com.example;
import java.util.HashSet;
import java.util.Set;

public class CommonCharacters {
    public static void main(String[] args) {
        String[] arr = {"label", "roller"};
        findCommonCharacters(arr);
    }

    public static void findCommonCharacters(String[] arr) {
        if (arr.length < 2) {
            System.out.println("Insufficient strings to compare.");
            return;
        }

        // Step 1: Store characters of the first string in a set
        Set<Character> commonSet = new HashSet<>();
        for (char c : arr[0].toCharArray()) {
            commonSet.add(c);
        }

        // Step 2: Find common characters between the first and second string
        Set<Character> resultSet = new HashSet<>();
        for (char c : arr[1].toCharArray()) {
            if (commonSet.contains(c)) {
                resultSet.add(c);
            }
        }

        // Step 3: Print common characters
        System.out.print("Common characters: ");
        for (char c : arr[1].toCharArray()) {
            if (resultSet.contains(c)) {
                System.out.print(c + " ");
                resultSet.remove(c); // To avoid duplicate prints
            }
        }
    }
}
