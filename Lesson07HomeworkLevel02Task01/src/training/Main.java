package training;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String INPUT_MESSAGE = "Enter a date (dd.mm.yyyy): ";
		String userInput;
		Scanner scanner = new Scanner(System.in);
		Calendar date;
		
		System.out.print(INPUT_MESSAGE);
		userInput = scanner.nextLine();
		
		date = stringToCalendar(userInput);
		compareToToday(date);
	}
	
	/**
	 * Converts validated dd.mm.yyyy String into Calendar
	 * 
	 * @param date <code>String</code>
	 * @return <code>Calendar</code>
	 * @author Oleg
	 */
	private static Calendar stringToCalendar(String date) {
		
		String[] dateArray = date.split("[.]"); 
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.DATE, Integer.parseInt(dateArray[0]));
		calendar.set(Calendar.MONTH, Integer.parseInt(dateArray[1]) - 1);
		calendar.set(Calendar.YEAR, Integer.parseInt(dateArray[2]));
		
		return calendar;
	}
	
	/**
	 * Compares Calendar date with today and displays mismatching parts
	 * (month, year)
	 * 
	 * @param date <code>Calendar</code>
	 * @author Oleg
	 */
	private static void compareToToday(Calendar date) {
		
		final String MISMATCH_MESSAGE = "Mismatch: ";
		final String MATCH_MESSAGE = "Month and year match";
		Calendar today = Calendar.getInstance();
		boolean mismatchesFound = false;
		
		if (date.get(Calendar.MONTH) != today.get(Calendar.MONTH)) {
			System.out.println(MISMATCH_MESSAGE 
					+ (date.get(Calendar.MONTH) + 1));
			mismatchesFound = true;
		}
		
		if (date.get(Calendar.YEAR) != today.get(Calendar.YEAR)) {
			System.out.println(MISMATCH_MESSAGE + date.get(Calendar.YEAR));
			mismatchesFound = true;
		}
		
		if (!mismatchesFound) {
			System.out.println(MATCH_MESSAGE);
		}
	}
}