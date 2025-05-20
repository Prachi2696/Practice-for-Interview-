package com.example.com.example;

public class ContainsDuplicate {

	public static boolean hasDuplicate(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length ; j++) {
				if (nums[i] == nums[j])
				{
					return true;
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 2, 3, 4 };
		System.out.println(hasDuplicate(input));
	}

}
