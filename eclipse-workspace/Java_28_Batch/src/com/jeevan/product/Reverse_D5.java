package com.jeevan.product;

import java.util.Scanner;

public class Reverse_D5 {

	public String reverse(String a) {
		String result = "";
		
		for(int i=a.length()-1;i>=0;i--) {
			result = result + a.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reverse_D5 r = new Reverse_D5();
		System.out.println("Enter a String : ");
		Scanner s = new Scanner(System.in);
		String sr = s.nextLine();
		
		System.out.println(" Reverse of String : " + r.reverse(sr));
		s.close();

	}

}
