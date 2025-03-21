package com.example.com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroup {
	 public static List<List<String>> groupAnagrams(String[] strs) {
//	List<String> l =new ArrayList<>();
//		 for (String string : strs) {
//			char [] charr= string.toCharArray();
//			Arrays.sort(charr);
//			String str = new String(charr);
////			System.out.println(str);
//			l.add(str);
//		}
//		 List<String> l2 =new ArrayList<>();
//		 for (int i=0;i< l.size();i++)
//		 {
//			 if(l.get(i)==l.get(i+1))
//			 {
//				 l2.add(l.get(i));
//			 }
//		 }
		 
		 
		  Map<String, List<String>> res = new HashMap<>();
	        for (String s : strs) {
	            char[] charArray = s.toCharArray();
	            Arrays.sort(charArray);
	            String sortedS = new String(charArray);
	       System.out.println(res.putIfAbsent(sortedS, new ArrayList<>()));   
	       System.out.println("---------------------");
	       System.out.println(   res.get(sortedS).add(s));
	        }
	        return new ArrayList<>(res.values());
		 
//		return l2;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: strs = ["act","pots","tops","cat","stop","hat"]
//
//				Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
		
		String [] input ={"act","pots","tops","cat","stop","hat"};
		
		System.out.println(groupAnagrams(input));
		
	}

}
