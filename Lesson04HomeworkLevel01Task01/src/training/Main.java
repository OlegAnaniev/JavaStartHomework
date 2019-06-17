package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String INPUT_MESSAGE = "Enter the number of columns:";
		final String INVALID_INPUT_MESSAGE = 
				"Amount of columns must be positive";
		final String ODD_COLUMN_PATTERN = "+++";
		final String EVEN_COLUMN_PATTERN = "***";
		final int ROWS = 6;
		Scanner scanner = new Scanner(System.in);
		int userInput;
		
		System.out.print(INPUT_MESSAGE + " ");
		userInput = scanner.nextInt();
		
		if (userInput <= 0) {
			System.out.println(INVALID_INPUT_MESSAGE);
			return;
		}
		
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < userInput; j++) {
				if (j % 2 != 0) {
					System.out.print(ODD_COLUMN_PATTERN);
				} else {
					System.out.print(EVEN_COLUMN_PATTERN);
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
//		Alternative solution		
		StringBuilder row = new StringBuilder();
		
		for (int i = 0; i < userInput; i++) {
			if (i % 2 != 0) {
				row.append(ODD_COLUMN_PATTERN);
			} else {
				row.append(EVEN_COLUMN_PATTERN);
			}
		}
		
		for (int i = 0; i < ROWS; i++) {
			System.out.println(row);
		}		
	}
}