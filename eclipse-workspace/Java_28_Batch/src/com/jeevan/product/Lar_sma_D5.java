package com.jeevan.product;

public class Lar_sma_D5 {

	public int Largest(int[] n) {
		int lar = n[0];
		for(int i= 1; i<n.length;i++ ) {
			if ( lar <= n[i]) {
				lar = n[i];
			}
		}
		return lar;
		
	}
	
	public int Smallest(int[] n) {
		int sma = n[0];
		for(int i= 1; i<n.length;i++ ) {
			if ( sma >= n[i]) {
				sma = n[i];
			}
		}
		return sma;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lar_sma_D5 ls = new Lar_sma_D5();
		int[] arr = {2,4,6,78,5,1,10,7,8,11};
		
		System.out.println("Largest Number : "+ls.Largest(arr));
		
		System.out.println("Smallest Number : "+ls.Smallest(arr));
	}

}
