package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String INPUT_MESSAGE = "Enter the amount of money: ";
		final String INVALID_INPUT_FORMAT_MESSAGE = "Invalid input format";
		final String NEGATIVE_INPUT_MESSAGE = 
				"The amount of money cannot be negative";
		Scanner scanner = new Scanner(System.in);
		String userInput;
		double numericValue;
		String[] numberParts;
		int fractionalPart;
		String integerPartText;
		String fractionalPartText;
		
		System.out.print(INPUT_MESSAGE);
		userInput = scanner.nextLine();
		
		try {
			numericValue = Double.parseDouble(userInput);
		} catch (NumberFormatException e) {
			System.out.println(INVALID_INPUT_FORMAT_MESSAGE);
			return;
		}
		
		if (numericValue < 0) {
			System.out.println(NEGATIVE_INPUT_MESSAGE);
			return;
		}
		
		numberParts = userInput.split("[.]");
		
		integerPartText = getText(Integer.parseInt(numberParts[0]));
		
		if (numberParts.length > 1) {
			
			if (numberParts[1].length() == 1) {
				fractionalPart = Integer.parseInt(numberParts[1] + "0");
			} else {
				fractionalPart = Integer.parseInt(numberParts[1].substring(0, 2));
			}			
			
			fractionalPartText = getText(fractionalPart);			
		} else {
			fractionalPartText = getText(0);
		}
		
		System.out.print(integerPartText + " dollar(s) " + fractionalPartText + " cent(s)");
	}
	
	private static String getText(int value) {
		
		if (value > 1000000) {
			return getText(value / 1000000) + " million " + 
					((value % 1000000 != 0) 
							? getText(value % 1000000) 
							: "");
		}
		
		if (value > 1000) {
			return getText(value / 1000) + " thousand " + 
					((value % 1000 != 0) ? getText(value % 1000) : "");
		}
		
		if (value >= 100) {
			return getText(value / 100) + " hundred " + 
					((value % 100 != 0) ? getText(value % 100) : "");
		}
		
		if (value > 20 && value % 10 != 0) {
			return getText(value / 10 * 10) + " " + getText(value % 10);
		}
		
		switch (value) {
		case 0:
			return "zero";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19:
			return "nineteen";
		case 20:
			return "twenty";
		case 30:
			return "thirty";
		case 40:
			return "forty";
		case 50:
			return "fifty";
		case 60:
			return "sixty";
		case 70:
			return "seventy";
		case 80:
			return "eighty";
		case 90:
			return "ninety";
		default:
			return "";
		}
	}
}