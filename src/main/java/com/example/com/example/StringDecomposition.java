package com.example.com.example;

//public class StringDecomposition {
//
//	public static void main(String[] args) {
//		String str = "a4b3c2d1";
//		char ch[] = str.toCharArray();
//
//		for (int i = 0; i < Character.getNumericValue(ch[1]); i++) {
//			System.out.print(ch[0]);
//		}
//		for (int i = 0; i < Character.getNumericValue(ch[3]); i++) {
//			System.out.print(ch[2]);
//		}
//		for (int i = 0; i < Character.getNumericValue(ch[5]); i++) {
//			System.out.print(ch[4]);
//		}
//		for (int i = 0; i < Character.getNumericValue(ch[7]); i++) {
//			System.out.print(ch[6]);
//		}
//
//		
////		for (int i = 0; i < ch.length; i++) {
////
////			int num = str.charAt(i);
////			if (!(num % 2 == 0)) {
////				for (int j = 0; j < Character.getNumericValue(ch[j + 1]); j++) {
////					System.out.print(ch[i]);
////				}
////			}
////
////		}
//	}
//}
public class StringDecomposition {
    public static void main(String[] args) {
        String str = "a4b3c2d1";
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i += 2) { // Process letter-digit pairs
            char letter = ch[i];
            int repeatCount = Character.getNumericValue(ch[i + 1]);

            for (int j = 0; j < repeatCount; j++) {
                System.out.print(letter);
            }
        }
    }
}
