/****************************************************************************** *  
 *  Purpose: Math Functions
 *
 *  @author  Naufil
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.stringFunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MathFunction {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select \n 1. PresentValue \n 2. PrintHarmonic \n 3. Sin Of Angle \n "
				+ "4. Cosine of Angle \n 5. Decimal To Binary \n "
				+ "6. Square root \n 7. Prime Number \n 8. factorial \n 9. Future Value");
		int choice;
		choice = scanner.nextInt();
		switch(choice) {
		case 1: 
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
			break;
		case 2:
			int number;
			System.out.println("Enter the Number For Harmonic series : ");
			number = scanner.nextInt();
			Utility.Printharmonic(number);
			break;
		case 3:
			int degree;
			double radian,sin;
			System.out.println("Enter sin of a Angle : ");
			degree = scanner.nextInt();
			radian = Utility.findRadian(degree);
			sin = Utility.findSin(radian);
			System.out.println("Sin " + degree + "  Angle = "+sin);
			break;
		case 4:
			int degree2;
			double radian2,cosine;
			System.out.println("Enter cosine of a Angle : ");
			degree2 = scanner.nextInt();
			radian2 = Utility.findRadian(degree2);
			cosine = Utility.findCosine(radian2);
			System.out.println("Cosine "+degree2 + " Angle = "+cosine);
			break;
		case 5:
			int decimal;
			System.out.println("Enter the Number :");
			decimal = scanner.nextInt();
			System.out.println("Decimal Number is " + decimal + " Binary : " + Utility.findBinary(decimal));
			break;
		case 6:
			double d,epsilon;
			epsilon = 1e-15;
			System.out.println("Enter number : ");
			d= scanner.nextDouble();
			System.out.println("Your Number is "+ d + "Square Root = "+ Utility.findSquareRoot(d, epsilon));
			break;
		case 7:
			int n;
			System.out.println("Enter Number : ");
			n = scanner.nextInt();
			System.out.println("your number is "+ n + " Prime = " + Utility.findPrime(n));
			break;
		case 8:
			int num;
			System.out.println("Enter Number :");
			num = scanner.nextInt();
			System.out.println("Your number "+num + " Factorial of Number = "+Utility.factorial(num));
			break;
		case 9:
			int compound,time;
			double rate;
			System.out.println("Enter Compount interest : ");
			compound = scanner.nextInt();
			System.out.println("Enter Rate : ");
			rate = scanner.nextDouble();
			System.out.println("Enter Time : ");
			time = scanner.nextInt();
			System.out.println("Future Value = " + Utility.futureValue(compound, rate, time));
				
		}
	
		
		
		scanner.close();
		
	}

}
