package com.example.com.example;

public class CountOfOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] numbers = { 7, 2, 9, 1, 5 ,9};
//		int count=0;
//		for (int i=0;i<numbers.length-1;i++)
//		{
//			for(int j=i+1;j<numbers.length;j++)
//			{
//				if(numbers[i]==numbers[j])
//				{
//					count++;
//					System.out.println("Number: "+numbers[i]);
//				}
//			}
//			
//		}
//		System.out.println("count: "+count);
		
	
		  int[] numbers = {7, 2, 9, 1, 5, 9,2};
	        int count = 0;
	    
//	                int target = 9;
//	              
//
//	                for (int num : numbers) {
//	                    if (num == target) {
//	                        count++;
//	                    }
//	                }
//
//	                System.out.println("Number " + target + " appears " + count + " times.");
	                
	                
	                
	                
	                
	                
	                for (int i = 0; i < numbers.length; i++) {
	                    for (int j = i + 1; j < numbers.length; j++) {
	                        if (numbers[i] == numbers[j]) {
	                            count++;
	                            System.out.println("Duplicate Number: " + numbers[i]);
	                            break; // Avoid counting the same duplicate multiple times
	                        }
	                    }
	                }

	                System.out.println("Total duplicate count: " + count);
	                
	                
	                
	                
	                
	                
	            }
	    


	
	}


