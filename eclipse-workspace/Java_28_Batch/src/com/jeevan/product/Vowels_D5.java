package com.jeevan.product;

import java.util.Scanner;


public class Vowels_D5 {
	
	public int vCount(String str) {
		int count = 0;
		for(int i=0;i< str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowels_D5 v = new Vowels_D5();
		System.out.println("Enter a string : ");
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		System.out.println("Count of vowels in String : " + v.vCount(a));
		s.close();
		
	}
}
