package com.bridgelabz.fibbonacci;

public class FibbonacciSeries {

	public static void main(String[] args) {
		/* 0yh and 1st number of the series are 0 and 1*/
		System.out.println("Welcome to Fibbonacci series");
		int n1 = 0, n2 = 1, n3;
		int count = 50;
		System.out.println(n1);
		System.out.println(n2);

		for (int i = 2; i <= count; i++) {
			/**/
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;

		}

	}
}
