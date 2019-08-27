package com.bridgelabz.stringFunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringPalindrom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str;
		System.out.println("Enter The String : ");
<<<<<<< HEAD
		str = scanner.next();
		
		if(Utility.checkPalindrom(str)) {
			System.out.println(str+" String is palindrome");
			}else {
				System.out.println(str+" is not a palindrome");
			}
	scanner.close();
=======
		str = scanner.nextLine();
>>>>>>> 9a1be2d8e46df59f7d03bdd4aa8d0e18b998b98f

		if (!Utility.checkPalindrom(str)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
		scanner.close();

	}

}
