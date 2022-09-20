package com.jeevan.product;

public class FizzBuzz_D4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i= 1;i <= 100 ;i ++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.print("FizzBuzz_D4 ");
			}
			else if(i % 5 == 0) {
				System.out.print("Buzz ");
			}
			else if(i % 3 == 0){
				System.out.print("Fizz ");
			}
			else {
				System.out.print(i + " ");
			}
		}

	}

}
