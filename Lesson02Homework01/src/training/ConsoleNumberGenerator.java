package training;

import java.util.Scanner;

public class ConsoleNumberGenerator extends NumberGenerator {
	
	private String userInput;

	@Override
	public int getNumber() {
		final String INPUT_MESSAGE = "Input 5-digit integer and press Enter:";		
		Scanner scanner = new Scanner(System.in);
				
		do {
			System.out.print(INPUT_MESSAGE + " ");
			userInput = scanner.nextLine();
		} while (!isUserInputValid());

		return number;		
	}
	
	private boolean isUserInputValid() {
		final String INVALID_FORMAT_MESSAGE = "Input value is not an integer";
		final String INVALID_LENGTH_MESSAGE = 
				"Input value is not a 5-digit integer";
				
		try {
			number = Integer.parseInt(userInput);
			
			if	((number > MIN_NEGATIVE_VALUE && number < MAX_NEGATIVE_VALUE)
					|| (number > MIN_POSITIVE_VALUE 
							&& number < MAX_POSITIVE_VALUE)) {
				return true;
			} else {
				System.out.println(INVALID_LENGTH_MESSAGE);
				return false;
			}			
		} catch (NumberFormatException e) {
			System.out.println(INVALID_FORMAT_MESSAGE);
			return false;
		}
	}
}