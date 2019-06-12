package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String INPUT_MESSAGE = "Enter ticket no.:";
		final String NEGATIVE_TICKET_NO_MESSAGE = "Ticket no. cannot be negative";
		final String ODD_TICKET_NO_MESSAGE = "Ticket with odd no. cannot be lucky";
		final String LUCKY_TICKET_MESSAGE = "The ticket is lucky";
		final String REGULAR_TICKET_MESSAGE = "The ticket is regular";
		Scanner scanner = new Scanner(System.in);
		int userInput;
		int tempUserInput;
		int numberLength = 0;
		int divisor = 1;
		int[] digits;
		int partOneSum = 0;
		int partTwoSum = 0;
		
		
		System.out.print(INPUT_MESSAGE + " ");
		userInput = scanner.nextInt();
		
		if (userInput < 0) {
			System.out.println(NEGATIVE_TICKET_NO_MESSAGE);
			return;
		}
		
		tempUserInput = userInput;
		do {			
			tempUserInput /= 10;
			divisor *= 10;
			numberLength++;
		} while (tempUserInput > 0);
		
		if (numberLength % 2 != 0) {
			System.out.println(ODD_TICKET_NO_MESSAGE);
			return;
		}
		
		digits = new int[numberLength];

		for (int i = 0; i < digits.length; i++) {
			digits[i] = userInput % divisor / (divisor / 10);
			divisor /= 10;
		}
		
		for (int i = 0; i < digits.length / 2; i++) {
			partOneSum += digits[i];
		}
		
		for (int i = digits.length / 2; i < digits.length; i++) {
			partTwoSum += digits[i];
		}
		
		if (partOneSum == partTwoSum) {
			System.out.println(LUCKY_TICKET_MESSAGE);
		} else {
			System.out.println(REGULAR_TICKET_MESSAGE);
		}
	}
}