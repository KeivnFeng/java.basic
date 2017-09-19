package com.kevin.test;

public class Power {


	public static void main(String args[]){
		System.out.println(power(-2,2));
	}
	
	public static double power(int a, int n){
		if(n == 0){
			return 1;
		}else if(n < 0){
			return 1.00/(a*power(a, (-n)-1));
		}else{
			return a*power(a,n-1);
		}
	}
	
	
	
	
}
