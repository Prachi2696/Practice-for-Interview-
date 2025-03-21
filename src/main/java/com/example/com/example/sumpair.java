package com.example.com.example;

public class sumpair {
public static int[] twoSum(int[] nums, int target) {
	
	
	for (int i=0;i<nums.length-1;i++)
	{
		for (int j=i+1;j<nums.length;j++)
		{
			if(nums[i]+nums[j]==target)
			{
				return new int [] {i,j};
			}
		}
	}
	
	
	return new int [0] ;
        
    }
	public static void main(String[] args) {
//		nums = [3,4,5,6], target = 7
		int nums[]= {3,4,5,6};
		int target =7;
		int [] result =twoSum(nums, target);
	for (int i : result) {
		System.out.println(i);
	}
		
	}
}
