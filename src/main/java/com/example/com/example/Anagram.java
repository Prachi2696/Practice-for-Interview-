package com.example.com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
	public boolean isAnagram(String s, String t) {

		char sarr[] = s.toCharArray();
		char tarr[] =t.toCharArray();
	
		Arrays.sort(sarr);
		Arrays.sort(tarr);
//		 System.out.println(sarr);
//		 System.out.println(tarr);	
		 
		 String sstr=new String(sarr);
		 String tstr=new String(tarr);
		 if(sstr.equals(tstr))
		 {
			 return true;
		 }
		 
		return false;
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Anagram a= new Anagram ();
System.out.println(a.isAnagram("racecaar", "carrace"));
	}

}
