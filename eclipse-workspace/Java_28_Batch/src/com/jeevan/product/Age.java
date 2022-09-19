package com.jeevan.product;
import java.util.Scanner;

public class Age {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Age : ");
		
		int age = s.nextInt();
		
		if(age >= 13 && age <= 19) {
			System.out.println("Teen");
		}
		else if(age < 13) {
			System.out.println("Kid");
		}
		else {
			System.out.println("Adult");
		}
		
		s.close();

	}

}
