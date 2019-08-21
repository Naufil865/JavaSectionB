package com.bridgelabz.stringFunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringPalindrom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str;
		System.out.println("Enter The String : ");
		str = scanner.nextLine();

		if (!Utility.checkPalindrom(str)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
		scanner.close();

	}

}
