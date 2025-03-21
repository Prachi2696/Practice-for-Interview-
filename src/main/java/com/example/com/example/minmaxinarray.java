package com.example.com.example;

public class minmaxinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 7, 2, 9, 1, 5, 9 };
		int target = 9;
		int max = 7;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > max) {
				max = numbers[i];
				System.out.println(max + "---max");
			}

			

		}
		// Step 2: Find the second largest value
        int max2 = Integer.MIN_VALUE; // Initialize to smallest possible value
        System.out.println(max2+"---max2");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != max && numbers[i] > max2) { // Should be smaller than max but greater than max2
                max2 = numbers[i];
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("Second Largest: " + max2);
        }
	}

}
