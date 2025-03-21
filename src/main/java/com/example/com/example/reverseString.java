package com.example.com.example;

public class reverseString {
	
	 public static String reverse(String string) {
	        char[] ch = string.toCharArray();
	        String newstr = "";
	        for (int i = ch.length - 1; i >= 0; i--) {
	            newstr += ch[i]; // Appending characters in reverse order
	        }

	        return newstr;
	    }
	public static void main(String[] args)
	{
//		Type1
//		String ostr="Hello";
//		char ch [] = ostr.toCharArray();
//		for (int i=ch.length-1;i>=0;i--)
//		{
//			System.out.println(ch[i]);
//		}
		
//	Type2	
//		String ostr=" Hello World";
//		char ch [] = ostr.toCharArray();
//		for (int i= ch.length-1;i>=0;i--)
//		{
//			System.out.println(ch[i]);
//		}
		
//		Type3
		String ostr="Hello World";
		String [] arrstr=ostr.split(" ");
		String opstr="";
		String [] result = new String [arrstr.length];
		for (int i=0;i<arrstr.length;i++)
		{
			
			result[i]=	reverse(arrstr[i]);

		}

		for (String string : result) {
			System.out.println(string);
		}
		
	}
	
}
