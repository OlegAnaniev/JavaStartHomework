package training;

import java.util.Scanner;

public class Main {
	
	final static String[] INPUT_METHODS = {"Console", "Random" };
	static String userInput;
	static int userChoice;
	static NumberSplitter splitter = null;	

	public static void main(String[] args) {
		displayMenu();
		getUserInput();
		
		try {
			if (!isUserInputValid()) {
				exitOnInvalidInput();
			} else {
				initializeSplitter();
				if	(splitter != null) {
					split();
				}				
			}			
		} catch (NumberFormatException e) {
			exitOnInvalidInput();
		}
	}
	
	private static void displayMenu() {
		final String WELLCOME_MESSAGE = "Number splitter";
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
	
	private static void initializeSplitter() {
		final String DEFAULT_CASE_MESSAGE = 
				"How did you manage to get this message? :)";
		
		switch (INPUT_METHODS[userChoice]) {
		case "Console":
			splitter = new NumberSplitter(new ConsoleNumberGenerator());
			break;
		case "Random":
			splitter = new NumberSplitter(new RandomNumberGenerator());
			break;
		default:
			System.out.println(DEFAULT_CASE_MESSAGE);
			break;
		}
	}
	
	private static void split() {		
		final String NUMBER_MESSAGE = "The number is:";
		final String DIGIT_MESSAGE_HEAD = "Digit";
		final String DIGIT_MESSAGE_TAIL = ":";
		int[] digits;
		int number;		
		
		digits = splitter.run();
		number = splitter.getNumber();
		
		System.out.println(NUMBER_MESSAGE + " " + number);
		for (int i = 0; i < digits.length; i++) {
			System.out.println(DIGIT_MESSAGE_HEAD + " " + i 
					+ DIGIT_MESSAGE_TAIL + " " + digits[i]);
		}		
	}
}