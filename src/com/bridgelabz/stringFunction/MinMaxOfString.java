package com.bridgelabz.stringFunction;

import java.util.Arrays;

public class MinMaxOfString {

	public static void main(String[] args) {
		String[] myArray = {"Abcd","JavaFX", "HBase", "OpenCV", "Java", "Hadoop", "Neo4j","Zxc"};
	      int size = myArray.length;

	      for(int i = 0; i<myArray.length; i++) {
	         for (int j = i+1; j<myArray.length; j++) {
	            if(myArray[i].compareTo(myArray[j])>0) {
	               String temp = myArray[i];
	               myArray[i] = myArray[j];
	               myArray[j] = temp;
	            }
	         }
	      }
	      
	      System.out.println(Arrays.toString(myArray));
	      System.out.println("Min Value : "+myArray[0]);
	      System.out.println("Max Value : "+myArray[size-1]);
	   }
}
