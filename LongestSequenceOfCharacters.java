package com.monocept.test;

import java.util.Scanner;

public class LongestSequenceOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a binary String of 0's and 1's : ");
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		int maxLen = longestSequence(str);
		System.out.println("Length of The longest sequence of consecutive 1's is : "+maxLen);
	}

	private static int longestSequence(String str) {
		int count = 0;
		int maxmLen = 0;
		for(int i = 0 ; i < str.length() ; ++i) {
			if(str.charAt(i) == '0'){
					count = 0;
			}
			else {
				count++;
				maxmLen = Math.max(maxmLen, count);
			}
		}
		return maxmLen;
	}
	

}
