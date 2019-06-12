package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String INPUT_MESSAGE = "Enter a number (int):";
		final String CONFIRMATION_MESSAGE = "Number is a palindrome";
		final String REJECT_MESSAGE = "Number is not a palindrome";
		Scanner scanner = new Scanner(System.in);
		int userInput;
		int tempUserInput;
		int numberLength = 0;
		int divisor = 1;
		int[] digits;
		
		System.out.print(INPUT_MESSAGE + " ");
		userInput = Math.abs(scanner.nextInt());
		
		tempUserInput = userInput;
		do {			
			tempUserInput /= 10;
			divisor *= 10;
			numberLength++;
		} while (tempUserInput > 0);
		
		digits = new int[numberLength];

		for (int i = 0; i < digits.length; i++) {
			digits[i] = userInput % divisor / (divisor / 10);
			divisor /= 10;
		}
		
		for (int i = 0; i < digits.length / 2; i++) {
			if (digits[i] != digits[digits.length - i - 1]) {
				System.out.println(REJECT_MESSAGE);
				return;
			}
		}
		
		System.out.println(CONFIRMATION_MESSAGE);
	}
}