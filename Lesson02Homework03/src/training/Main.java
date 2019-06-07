package training;

import java.util.Scanner;

public class Main {

	final static String[] INPUT_METHODS = {"Console", "Random" };
	static String userInput;
	static int userChoice;
	static CircumferenceCalculator calculator = null;	

	public static void main(String[] args) {
		displayMenu();
		getUserInput();
		
		try {
			if (!isUserInputValid()) {
				exitOnInvalidInput();
			} else {
				initializeCalculator();
				if	(calculator != null) {
					calculate();
				}				
			}			
		} catch (NumberFormatException e) {
			exitOnInvalidInput();
		}
	}
	
	private static void displayMenu() {
		final String WELLCOME_MESSAGE = "Circumference Calculator";
		final String SELECT_INPUT_MESSAGE = "Select data input method:";
		
		System.out.println(WELLCOME_MESSAGE);
		System.out.println(SELECT_INPUT_MESSAGE);
		for	(int i = 0; i < INPUT_METHODS.length; i++) {
			System.out.println(i + " " + INPUT_METHODS[i]);
		}
	}
	
	private static void getUserInput() {
		final String INPUT_MESSAGE = "Choose and press Enter:";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(INPUT_MESSAGE + " ");
		userInput = scanner.nextLine();
	}
	
	private static boolean isUserInputValid() throws NumberFormatException {
		userChoice = Integer.parseInt(userInput);				
		return (userChoice >= 0 && userChoice < INPUT_METHODS.length) ? true 
																	  : false;
	}
	
	private static void exitOnInvalidInput() {
		final String INVALID_INPUT_MESSAGE = 
				"Invalid input. Closing application";
		
		System.out.println(INVALID_INPUT_MESSAGE);
	}
	
	private static void initializeCalculator() {
		final String DEFAULT_CASE_MESSAGE = 
				"How did you manage to get this message? :)";
		
		switch (INPUT_METHODS[userChoice]) {
		case "Console":
			calculator = 
				new CircumferenceCalculator(new ConsoleRadiusGenerator());
			break;
		case "Random":
			calculator = 
				new CircumferenceCalculator(new RandomRadiusGenerator());
			break;
		default:
			System.out.println(DEFAULT_CASE_MESSAGE);
			break;
		}
	}
	
	private static void calculate() {		
		final String RADIUS_MESSAGE = "The radius is:";
		final String CIRCUNFERENCE_MESSAGE = "The circumference is:";
		double circumference;
		double radius;		
		
		try {
			circumference = calculator.run();
			radius = calculator.getRadius();
			
			System.out.println(RADIUS_MESSAGE + " " + radius);
			System.out.println(CIRCUNFERENCE_MESSAGE + " " + circumference);
		} catch (RadiusDataException e) {
			System.out.println(e.getMessage());
		}		
	}
}