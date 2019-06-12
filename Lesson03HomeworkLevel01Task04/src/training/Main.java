package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String WELLCOME_MESSAGE = 
				"Input triangle side lengths (double):";
		final String INPUT_MESSAGE_HEAD = "Side";
		final String INPUT_MESSAGE_TAIL = ":";
		final String CONFIRMATION_MESSAGE = "Triangle exists";
		final String REJECT_MESSAGE = "Triangle does not exist";
		final int TRIANGLE_SIDE_COUNT = 3;		
		Scanner scanner = new Scanner(System.in);
		double[] userInput = new double[TRIANGLE_SIDE_COUNT];

		System.out.println(WELLCOME_MESSAGE);
		
		char c = 'a';
		for (int i = 0; i < userInput.length; i++) {
			System.out.print(INPUT_MESSAGE_HEAD + " " + c 
					+ INPUT_MESSAGE_TAIL + " ");
			userInput[i] = scanner.nextDouble();
		}
		
		if ((userInput[0] + userInput[1] > userInput[2])
				&& (userInput[1] + userInput[2] > userInput[0]) 
				&& (userInput[2] + userInput[0] > userInput[1])) {
			System.out.println(CONFIRMATION_MESSAGE);
		} else {
			System.out.println(REJECT_MESSAGE);
		}
	}
}