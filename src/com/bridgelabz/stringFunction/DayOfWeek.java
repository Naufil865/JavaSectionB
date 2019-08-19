package com.bridgelabz.stringFunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		int day,month,year,d1;
		boolean leapyear,validdate;
		System.out.println("Enter Year : ");
		year = scanner.nextInt();
		System.out.println("Enter Month : ");
		month = scanner.nextInt();
		System.out.println("Enter Day : ");
		day = scanner.nextInt();
		leapyear = utility.Leapyear(year);
		validdate = utility.checkValidationDate(month, day, leapyear);
		
		if(validdate) {
			d1 = Utility.calculateDayOfWeek(day, month, year);
			
			switch(d1) {
			case 0: 
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			}
		}
		else {
			System.out.println("Invalid Date ");
		}
		scanner.close();

	}

}
