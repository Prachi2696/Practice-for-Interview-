package com.example.com.example;

public class topKfrequentElements {
	
	  public static  int[] topKFrequent(int[] nums, int k) {
		  
		  int[] result=new int[4];
		  
		  for(int i =0;i<nums.length;i++)
		  {
			  for(int j =i+1;j<nums.length;j++)
			  {
				  if(nums[i]==nums[j])
				  {
					  result[i]=nums[i];				  }
			  }
		  }
		return result;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		nums = [1,2,2,3,3,3], k = 2
		
		int [] nums = {1,2,2,3,3};
		int k =2;
		 int[] result=topKFrequent(nums, k);
		 for (int i : result) {
			System.out.println(i+" ");
		}
		
	}

}
