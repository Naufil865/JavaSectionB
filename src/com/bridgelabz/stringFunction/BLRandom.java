package com.bridgelabz.stringFunction;

import java.util.Scanner;

import com.bridgelabz.utility.LibUtility;

public class BLRandom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double probabilities [] = {0.5,0.3,0.1,0.1};
		
		int sseed;
		System.out.println("Enter seed : ");
		sseed = scanner.nextInt();
		LibUtility.setSeed(sseed);
	
		System.out.println("seed = " + LibUtility.getSeed());
        for (int i = 0; i < sseed; i++) {
          System.out.printf("%2d ",   LibUtility.uniform(100));//d is decimal value but within 100
           System.out.printf("%8.5f = ", LibUtility.uniform(10.0, 99.0));//.5 means after '.' value 
           System.out.printf("%5b =",   LibUtility.bernoulli(0.5)); // return boolean
           System.out.printf("%7.5f =", LibUtility.gaussian(9.0, 0.2)); //on left side of '.'will be 7 value and right side will be 5
           System.out.printf("%1d ",   LibUtility.discrete(probabilities));
       
        }
        scanner.close();
	}
}
