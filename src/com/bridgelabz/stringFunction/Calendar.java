package com.bridgelabz.stringFunction;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Calendar {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Utility utility = new Utility();
	int month,year,day,days;
	System.out.println("Enter Year : ");
	year = scanner.nextInt();
	System.out.println("Enter Month : ");
	month = scanner.nextInt();
	
	boolean leapyear;
	if(utility.LeapYearValidation(year)) {
		leapyear = utility.Leapyear(year);
		if(utility.checkValidationDate(month, 1, leapyear)) {
			day = Utility.calculateDayOfWeek(1, month, year);
			days = Utility.daysOfMonth(month, leapyear);
			switch (day) {
			case 0:
				System.out.println("SUN MON TUE WED THU FRI SAT");
				for (int i = 1; i <= days; i++) {
					if (i <= 9) {
						System.out.print(i + "   ");
					} else {
						System.out.print(i + "  ");
					}
					if (i % 7 == 0) {
						System.out.println();
					}
				}
				break;
			case 1:
				System.out.println("SUN MON TUE WED THU FRI SAT");
				System.out.print("    ");
				for (int i = 1; i <= days; i++) {

					if (i <= 9) {
						System.out.print(i + "   ");
					} else {
						System.out.print(i + "  ");
					}
					if (i == 6 || i == 13 || i == 20 || i == 27) {
						System.out.println();
					}
				}
				break;
			case 2:
				System.out.println("SUN MON TUE WED THU FRI SAT");
				System.out.print("        ");
				for (int i = 1; i <= days; i++) {

					if (i <= 9) {
						System.out.print(i + "   ");
					} else {
						System.out.print(i + "  ");
					}
					if (i == 5 || i == 12 || i == 19 || i == 26) {
						System.out.println();
					}
				}
				break;
			case 3:
				System.out.println("SUN MON TUE WED THU FRI SAT");
				System.out.print("            ");
				for (int i = 1; i <= days; i++) {

					if (i <= 9) {
						System.out.print(i + "   ");
					} else {
						System.out.print(i + "  ");
					}
					if (i == 4 || i == 11 || i == 18 || i == 25) {
						System.out.println();
					}
				}
				break;
			case 4:
				System.out.println("SUN MON TUE WED THU FRI SAT");
				System.out.print("                ");
				for (int i = 1; i <= days; i++) {

					if (i <= 9) {
						System.out.print(i + "   ");
					} else {
						System.out.print(i + "  ");
					}
					if (i == 3 || i == 10 || i == 17 || i == 24) {
						System.out.println();
					}
				}
				break;
			case 5:
				System.out.println("SUN MON TUE WED THU FRI SAT");
				System.out.print("                    ");
				for (int i = 1; i <= days; i++) {

					if (i <= 9) {
						System.out.print(i + "   ");
					} else {
						System.out.print(i + "  ");
					}
					if (i == 2 || i == 9 || i == 16 || i == 23 || i == 30) {
						System.out.println();
					}
				}
				break;
			case 6:
				System.out.println("SUN MON TUE WED THU FRI SAT");
				System.out.print("                        ");
				for (int i = 1; i <= days; i++) {

					if (i <= 9) {
						System.out.print(i + "   ");
					} else {
						System.out.print(i + "  ");
					}
					if (i == 1 || i == 8 || i == 15 || i == 22 || i == 29) {
						System.out.println();
					}
				}
				break;
			}

		} else
			System.out.println("Enter valid month");
	} else
		System.out.println("Please enter valid year");
	scanner.close();	
	}
}
 