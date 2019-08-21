package com.bridgelabz.utility;

import java.util.Arrays;

public class BLUtility {
	
		public static double max(double[] arr) {
			double max = arr[0];
			for(int i = 1;i <=arr.length-1;i++) {
				if(arr[i]>max) {
					max = arr[i];
				}
			}
			return max;
		}
		public static double Min(double arr[]) {
			double min = arr[0];
			for(int i = 1 ; i<=arr.length-1;i++) {
				if(min > arr[i]) {
					min = arr[i];
				}
			}
			return min;
		}
		
		public static double Mean(double arr[]) {
			double sum = 0;
			for(int i = 0 ; i<=arr.length-1;i++) {
				sum = sum + arr[i];
			}
			return sum / (arr.length);
		}
		
		public static double Variance(double arr[]) {
			int n = arr.length+1;
			double mean = Mean(arr);
			double temparr [] = new double[n];
			
			for(int i=0 ; i <= arr.length ; i++) {
				temparr[i] = temparr[i] - mean;
			}
			for(int i=0 ; i<=arr.length;i++) {
				temparr[i] = Math.pow(Math.abs(temparr[i]),2);
			}
			double sumtemparr = 0;
			for(int i=0;i<=arr.length;i++) {
				sumtemparr = sumtemparr+ temparr[i];
			}
			return sumtemparr / (n-2);
		}
		
		
		public static double standardDeviation(double[] arr) {
			return Math.sqrt(Variance(arr));
		}

		public static double median(double[] arr) {
			// First we sort the array
			Arrays.sort(arr);
			int n = arr.length;
			// check for even case
			if (n % 2 != 0)
				return (double) arr[n / 2];

			return (double) (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
		}
		
}


