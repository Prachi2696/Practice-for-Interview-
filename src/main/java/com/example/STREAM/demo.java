package com.example.STREAM;

public class demo {
	public static boolean hasDuplicate(int[] nums) {
		int count = 0;
		 for (int i = 0; i < nums.length; i++) { // Outer loop
	            for (int j = i + 1; j < nums.length; j++) { // Inner loop to compare with next elements
	                if (nums[i] == nums[j]) {
	                    return true; // Found duplicate
	                }
	            }
	        }
		return false;
		
	}
	 public static void main(String[] args) 
	{
		int nums []= {1,2,3,1,2,3};
		System.out.println(hasDuplicate(nums));
	}

}
