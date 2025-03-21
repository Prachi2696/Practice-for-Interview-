package com.example.com.example;

public class findrepeatingcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ori = "abcbdefgfhiai";
		char[] ch = ori.toCharArray();
		int count=0;
		for(int i=0;i<ch.length-1;i++)
		{
			char temp= ch[i];
			 for(int j=i+1;j<ch.length;j++)
			 {
				 if(temp == ch[j])
				 {
					 count++;
					 System.out.println(temp);
				 }
			 }
		}
		
		System.out.println(count);
	}

}
