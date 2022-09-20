package com.jeevan.product;

import java.util.Scanner;

public class Fibonacci_D4 {

	public int series(int n) {
		
        // 1 extra to handle case, n = 0
		int f[] = new int[n + 2];
		 f[0] = 0;
		 f[1] = 1;
	
		for(int i=2; i<=n; i++) {
			 f[i] = f[i-1] + f[i-2];
			 
		}
		return f[n];
	}
	
	/*
	 *   public int series(int n)
    {
        
        if (n <= 1)
            return n;
  
        // Recursive call
        return series(n - 1)
            + series(n - 2);
    }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = s.nextInt();
		
		Fibonacci_D4 f = new Fibonacci_D4();
	
		for (int i = 0; i < number; i++) {
            System.out.print(f.series(i) + " ");
		}
		s.close();
		
	}

}
