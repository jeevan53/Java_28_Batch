package com.jeevan.product;

import java.util.Scanner;

public class Contains_D6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		String sr = s.nextLine();
		
		String result = s.nextLine();
		
		Boolean res = false;
		
			//if(sr.contains(result)) {
			//	res = true;
			//}
		String[] out = sr.split(" ");
		for(int i=0;i<out.length;i++) {
			if(out[i].equals(result)) {
				res = true;
				break;
			}
		}
		System.out.println(res);
		s.close();
	}

}
