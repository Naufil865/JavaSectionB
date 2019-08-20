package com.bridgelabz.stringFunction;

import com.bridgelabz.utility.Utility;

public class MaxMinOfInteger {

	public static void main(String[] args) {
		int arr[] = {5,4,2,1,10,9,8};
		int max,min;
		min = Utility.getMin(arr);
		System.out.println("Minimum Value in Array : "+min);
		max = Utility.getMax(arr);
		System.out.println("Maximum Value in Array : " + max);
		

	}

}
