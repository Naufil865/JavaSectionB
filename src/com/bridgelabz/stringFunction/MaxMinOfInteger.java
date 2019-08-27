package com.bridgelabz.stringFunction;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class MaxMinOfInteger {
	
	public static int ssmall(int small,int second,int[] arr) {
		small = arr[0];
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] < small) {
				second = small;
				small = arr[i];
			}
			else if(arr[i] < second && arr[i] != small) {
				second = arr[i];
			}
		}
		return second;
	}
	
	public static int slarge(int large,int second,int[] arr) {
		large = arr[0];
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] > large) {
				second = large;
				large = arr[i];
			}
			else if(arr[i] > second && arr[i] != large) {
				second = arr[i];
			}
		}
		return second;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {5,4,20,19,10,9,8,15,12,18};
		int max,min;
		min = Utility.getMin(arr);
		System.out.println("Minimum Value in Array : "+min);
		max = Utility.getMax(arr);
		System.out.println("Maximum Value in Array : " + max);
		
	
		
		int t2;
		int t1 = Utility.test(arr);
		System.out.println("Min : "+t1);
		t2= Utility.test2(arr);
		System.out.println("MAx : "+ t2);
		
		int small,secondsmall;
		small = Integer.MAX_VALUE;
		secondsmall = Integer.MAX_VALUE;
		System.out.println("Second small : "+ Utility.secondsmall(small, secondsmall, arr));
		
		int large,secondlarge;
		large = Integer.MIN_VALUE;
		secondlarge = Integer.MIN_VALUE;
		System.out.println("Second Large : "+ Utility.secondlarge(large, secondlarge, arr));
	
	}

}
