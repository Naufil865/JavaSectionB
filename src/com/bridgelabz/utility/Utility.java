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

}
