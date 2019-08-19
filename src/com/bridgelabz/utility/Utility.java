package com.bridgelabz.utility;

import java.util.Arrays;

public class Utility {
	/**
	 * @param str1arr
	 * @param str2arr
	 * @return
	 */
	public static boolean findStringAnagram(char [] str1arr ,char [] str2arr ) {
		if(str1arr.length != str2arr.length) {
			return false;
		}else {
			Arrays.sort(str1arr);
			Arrays.sort(str2arr);
			for(int i = 0 ; i < str1arr.length ; i++) {
				if(str1arr[i] != str2arr[i]) {
					return false;
				}
			}
			return true;
		}
	}
	
	/**
	 * @param str
	 * @return
	 */
	public static boolean checkPalindrom(String str) {
		String reverse = " ";
		for(int i = str.length()- 1 ; i >=0 ;i--) {
			reverse = reverse + str.charAt(i);
		}
		if(str != reverse) {
			return false;
		}else {
			return true;
		}
		
		
	}
	
	// Utility function to swap two characters in a character array
		private static void swap(char[] arr, int i, int j) {
			char c = arr[i];
			arr[i] = arr[j];
			arr[j] = c;
		}

		// Utility function to reverse a char array between specified indices
		private static void reverse(char[] arr, int i, int j) {
			// do till two end-points intersect
			while (i < j) {
				swap(arr, i++, j--);
			}
		}
	public static void iterative(String str) {
		char[] s = str.toCharArray();
		int n = str.length();
		Arrays.sort(s);
		while(true) {
			// Print current permutation
				System.out.print(String.valueOf(s) + " ");
				// Find largest index i such that s[i-1] is less than s[i]
				int i = n - 1;
				while (s[i - 1] >= s[i]) {
					// if i is first index of the string, that means we are
					// already at last possible permutation
					// (string is sorted in reverse order)
					if (--i == 0)
						return;
				}
				// find highest index j to the right of index i such that
				// s[j] > s[i–1] (s[i..n-1] is sorted in reverse order)

				int j = n - 1;
				while (j > i && s[j] <= s[i - 1])
					j--;
				// Swap characters at index i-1 with index j
				swap(s, i - 1, j);

				// reverse the substring s[i..n-1] and return true
				reverse(s, i, n - 1);
			
		}
	}
	
	public static void permutationRecursion(String str, int startIndex, int endIndex) {
		if (startIndex == endIndex) {
			System.out.print(str + " ");

		} else {
			for (int i = startIndex; i <= endIndex; i++) {
				str = swap(str, startIndex, i);
				// System.out.println("x="+str);
				permutationRecursion(str, startIndex + 1, endIndex);
				str = swap(str, startIndex, i);
				// System.out.println("y="+str);
			}
		}
	}
		public static String swap(String str, int i, int j) {
			char temp;
			char[] charArray = str.toCharArray();
			temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			return String.valueOf(charArray);
		}
	
}
