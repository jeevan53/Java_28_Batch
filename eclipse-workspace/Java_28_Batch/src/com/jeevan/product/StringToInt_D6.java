package com.jeevan.product;

import java.util.Scanner;

public class StringToInt_D6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		
		int result = Integer.parseInt(str) + Integer.valueOf(str);
		
		System.out.println("Result : " + result);
		System.out.println("Int number : " + Integer.parseInt(str));
		
		System.out.println("Int number : " + Integer.valueOf(str));
		
		sc.close();
	}

}
