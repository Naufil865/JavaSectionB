package com.bridgelabz.stringFunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringPermutation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		System.out.println("Enter String : ");
		str=scanner.next();
		int strLength=str.length()-1;
		//Permutation with recursion
		System.out.println("Printing Recursive Permutation");
		Utility.permutationRecursion(str, 0, strLength);
		
		System.out.println("Printing Iterative Permutation");
		Utility.iterative(str);
		
		scanner.close();
	}

}
