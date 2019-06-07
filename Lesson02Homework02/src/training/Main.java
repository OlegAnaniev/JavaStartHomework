package training;

import java.util.Arrays;
import java.util.Scanner;

public class Main {	
	
	final static String[] INPUT_METHODS = {"Console", "Random" };
	static String userInput;
	static int userChoice;
	static TriangleSpaceCalculator calculator = null;	
	
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
		final String WELLCOME_MESSAGE = "Triangle space calculator";
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
			new TriangleSpaceCalculator(new ConsoleTriangleData());
			break;
		case "Random":
			calculator = new TriangleSpaceCalculator(new RandomTriangleData());
			break;
		default:
			System.out.println(DEFAULT_CASE_MESSAGE);
			break;
		}
	}
	
	private static void calculate() {		
		final String RESULT_MESSAGE = "Result:";				
		double[] triangleSides;
		double triangleSpace;
		
		calculator.setTriangleSides();
		triangleSides = calculator.getTriangleSides();
		System.out.println(Arrays.toString(triangleSides));
		
		try {			
			triangleSpace = calculator.run();
			System.out.println(RESULT_MESSAGE + " " + triangleSpace);
		} catch (TriangleDataException e) {
			System.out.println(e.getMessage());
		}		
	}
}