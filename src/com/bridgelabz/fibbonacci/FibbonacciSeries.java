package com.bridgelabz.fibbonacci;

public class FibbonacciSeries {

	public static void main(String[] args) {
		
		int n1=0,n2=1,n=5;
		System.out.println(n1);
		System.out.println(n2);
		findSeries(n,n1,n2);
		
	}

	private static void findSeries(int n,int n1,int n2) {
		int n3;
		for(int i=2;i<n;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n2=n3;
			n1=n2;
		}
		
		
	}

}
