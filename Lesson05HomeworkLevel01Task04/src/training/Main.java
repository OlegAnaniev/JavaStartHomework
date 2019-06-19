package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String INPUT_MESSAGE = "Enter some text: ";
		final char NEEDLE = 'b';
		final String OUTPUT_MESSAGE_HEAD = "Count of symbol '";
		final String OUTPUT_MESSAGE_TAIL = "': ";
		Scanner scanner = new Scanner(System.in);
		String userInput;
		char[] userInputChars;
		int needleCount = 0;
		
		System.out.print(INPUT_MESSAGE);
		userInput = scanner.nextLine();
		
		userInputChars = userInput.toCharArray();
		
		for (int i = 0; i < userInputChars.length; i++) {
			if (userInputChars[i] == NEEDLE) {
				needleCount++;
			}
		}
		
		System.out.println(OUTPUT_MESSAGE_HEAD + NEEDLE + OUTPUT_MESSAGE_TAIL 
				+ needleCount);
	}
}