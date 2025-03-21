package com.example.com.example;

import java.util.HashSet;
import java.util.Set;

//Find the First Non-Repeating Character in a String
//
//Input: "swiss"
//Output: 'w'
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "swiss";
		char [] ch = str.toCharArray();
//		HashSet<Character> s= new HashSet<>();
//		for (Character character : ch) {
//			s.add(character);
//		}
//		System.out.print(s);
		
		for(int i=0;i<= ch.length-1;i++)
		{
			if(ch[i]==ch[i+1])
			{
				System.out.println(ch[i]);
			}
		}
	}

}
