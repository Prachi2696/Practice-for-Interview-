package com.example.com.example;

public class ConcantationArrays {
	 public static int[] getConcatenation(int[] nums) {
 
		  int len = nums.length;
	        int[] ans = new int[2*len];
	        for(int i = 0; i < len; i++){
	            ans[i] = nums[i];
	            ans[i+len] = nums[i];
	        }
	        return ans;
	    
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3};
		
		int [] result=getConcatenation(arr);
		for (int i : result) {
			System.out.print(i+" ");
		}
		


	}

}
