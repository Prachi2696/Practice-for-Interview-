package com.example.com.example;

public class ReverseWordinSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input:  "Java is fun"
//			Output: "fun is Java"

		String original = "Java is fun";
		String [] str= original.split(" ");
		
		for (int i = str.length -1 ;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
	}

}
