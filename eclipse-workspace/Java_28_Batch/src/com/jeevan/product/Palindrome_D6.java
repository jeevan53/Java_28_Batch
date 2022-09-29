package com.jeevan.product;

import java.util.Scanner;

public class Palindrome_D6 {

	
	public String reverse(String a) {
		String result = "";
		
		for(int i=a.length()-1;i>=0;i--) {
			result = result + a.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Palindrome_D6 r = new Palindrome_D6();
		System.out.println("Enter a String : ");
		Scanner s = new Scanner(System.in);
		String sr = s.nextLine();
		
		//System.out.println(" Reverse of String : " + r.reverse(sr));
		
		if(sr.equals(r.reverse(sr))){
			System.out.println("It is palindrome string");
		}
		else {
			System.out.println("It is not palindrome string");
		}
		s.close();

	}

}
