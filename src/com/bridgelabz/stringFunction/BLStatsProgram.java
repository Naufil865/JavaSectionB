package com.bridgelabz.stringFunction;
import com.bridgelabz.utility.BLUtility;


public class BLStatsProgram {

	public static void main(String[] args) {
		double arr[] = {1,2,3,4}; 
		System.out.println("Max : " + BLUtility.max(arr));
		System.out.println("Min : " + BLUtility.Min(arr));
		System.out.println("Mean : "+ BLUtility.Mean(arr));
		System.out.println("Variance : "+BLUtility.Variance(arr));
		System.out.println("Sample Standard Deviation : " + BLUtility.standardDeviation(arr));
		System.out.println("Median : "+BLUtility.median(arr));
	}

}
