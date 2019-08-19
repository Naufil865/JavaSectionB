package com.bridgelabz.stringFunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MathFunction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int c,t;
		double r,result;
		System.out.println("Enter Compound Interset : ");
		c = scanner.nextInt();
		System.out.println("Enter Time : ");
		t = scanner.nextInt();
		System.out.println("Enter Rate : ");
		r = scanner.nextDouble();
		result = Utility.MathFuction(c, r, t);
		System.out.println("Present Value is : "+ result);
		
		scanner.close();
		
	}

}
