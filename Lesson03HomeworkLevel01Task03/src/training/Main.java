package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String INPUT_MESSAGE = "Enter a year:";
		final String OUTPUT_MESSAGE = "Days:";
		final int DAYS_IN_REGULAR_YEAR = 365;
		final int DAYS_IN_LEAP_YEAR = 366;
		Scanner scanner = new Scanner(System.in);
		int userInput;
		boolean dividesBy4;
		boolean dividesBy100;
		boolean dividesBy400;
		
		System.out.print(INPUT_MESSAGE + " ");
		userInput = scanner.nextInt();
		
		dividesBy4 = (userInput % 4 == 0) ? true : false;
		
		if (dividesBy4) {
			dividesBy100 = (userInput % 100 == 0) ? true : false;
			dividesBy400 = (userInput % 400 == 0) ? true : false;
			
			if (!dividesBy100 || (dividesBy100 && dividesBy400)) {
				System.out.println(OUTPUT_MESSAGE + " " + DAYS_IN_LEAP_YEAR);
				return;
			}
		} 
		
		System.out.println(OUTPUT_MESSAGE + " " + DAYS_IN_REGULAR_YEAR);
	}
}