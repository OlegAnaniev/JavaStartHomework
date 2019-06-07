package training;

import java.util.Scanner;

public class ConsoleRadiusGenerator extends RadiusGenerator {
	
	private String userInput;

	@Override
	public double getRadius() {
		final String INPUT_MESSAGE = "Input positive double and press Enter:";		
		Scanner scanner = new Scanner(System.in);
				
		do {
			System.out.print(INPUT_MESSAGE + " ");
			userInput = scanner.nextLine();
		} while (!isUserInputValid());

		return radius;		
	}
	
	private boolean isUserInputValid() {
		final String INVALID_FORMAT_MESSAGE = "Input value is not a double";
				
		try {
			radius = Double.parseDouble(userInput);
			
			if	((radius > 0)) {
				return true;
			} else {
				System.out.println(NEGATIVE_VALUE_MESSAGE);
				return false;
			}			
		} catch (NumberFormatException e) {
			System.out.println(INVALID_FORMAT_MESSAGE);
			return false;
		}
	}
}