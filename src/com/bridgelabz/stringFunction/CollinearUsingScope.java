package com.bridgelabz.stringFunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CollinearUsingScope {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1,y1,x2,y2,x3,y3;
		
		System.out.println("Enter Value For X1 = ");
		x1 = scanner.nextInt();
		System.out.println("Enter Value Y1 = ");
		y1 = scanner.nextInt();
		System.out.println("Enter value For X2 = ");
		x2 = scanner.nextInt();
		System.out.println("Enter value For Y2 = ");
		y2 = scanner.nextInt();
		System.out.println("Enter value For X3 = ");
		x3 = scanner.nextInt();
		System.out.println("Enter value For Y3 = ");
		y3 = scanner.nextInt();
		Utility.checkCollinearUsingScope(x1, y1, x2, y2, x3, y3);
		
		scanner.close();
	}

}
