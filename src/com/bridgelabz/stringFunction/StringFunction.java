package com.bridgelabz.stringFunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringFunction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		String str1,str2;
		char [] str1arr,str2arr; 
		System.out.println("Enter the first String : ");
		str1 = scanner.next();
		System.out.println("Enter the Second String : ");
		str2 = scanner.next();
		str1arr = str1.toCharArray(); //to convert string into character of sequence
		str2arr = str2.toCharArray();
		
		if(Utility.findStringAnagram(str1arr, str2arr)) {
			System.out.println("String is Anagram");
		}else {
			System.out.println("Not a Anagram");
		}
		scanner.close();
	}
	

}
