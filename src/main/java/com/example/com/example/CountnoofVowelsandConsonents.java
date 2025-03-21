package com.example.com.example;

public class CountnoofVowelsandConsonents {
//	Count the Number of Vowels and Consonants in a String
//
//	Input: "hello"
//	Output: Vowels: 2, Consonants: 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "prachi";
		char ch [] =str.toCharArray();
		int countv = 0,countc =0;
		for (char c : ch) {
			if(c=='a' || c=='i' || c=='o'|| c=='e'|| c=='u')
			{
				countv++;
			}
			else
			{
				countc++;
			}
		}
		System.out.print("Consonents="+countc+",Vowels="+countv);
	}

}
