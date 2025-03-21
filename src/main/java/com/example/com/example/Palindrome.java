package com.example.com.example;

//Check if a String is Palindrome
//
//Input: "madam"
//Output: true
//Input: "hello"
//Output: false
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="hello";
		char ch [] = str.toCharArray();
		String  newstr="";
		for (int i=ch.length-1;i>=0;i--)
		{
			newstr +=ch[i];
		}
//		System.out.println(newstr+"-----newstr");
		if(str.equalsIgnoreCase(newstr))
			System.out.println("True");
		else
			System.out.println("False");
		
	}

}
