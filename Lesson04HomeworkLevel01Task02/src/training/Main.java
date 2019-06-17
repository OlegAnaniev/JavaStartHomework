package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String INPUT_MESSAGE_HEAD = "Enter an int (";
		final String INPUT_MESSAGE_TAIL = "):";
		final String INVALID_INPUT_MESSAGE = "Number must be in range";
		final String FACTORIAL_SYMBOL = "!";
		final int MIN = 5;
		final int MAX = 15;
		Scanner scanner = new Scanner(System.in);
		int userInput;
		long factorial = 1;
		
		System.out.print(INPUT_MESSAGE_HEAD + MIN + " - " + MAX 
				+ INPUT_MESSAGE_TAIL + " ");
		userInput = scanner.nextInt();
		
		if (userInput < MIN || userInput > MAX) {
			System.out.println(INVALID_INPUT_MESSAGE + " " + MIN + " - " 
					+ MAX);
			return;
		}
		
		for (int i = userInput; i > 1; i--) {
			factorial *= i;
		}
		
//		Alternative solution
//		factorial = factorial(userInput);
		
		System.out.println(userInput + FACTORIAL_SYMBOL + " = " + factorial);
	}
	
	private static long factorial(int number) {
		if (number == 2) {
			return number;
		}
		
		return number * factorial(number - 1);
	}
}