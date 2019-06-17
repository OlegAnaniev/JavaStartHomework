package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String INPUT_MESSAGE = "Enter shape's height:";
		final String INVALID_INPUT_MESSAGE = "Height must be positive";
		final String PATTERN = "*";
		Scanner scanner = new Scanner(System.in);
		int height;
		int length;
		int verticalPosition = 0;
		int horisontalPosition = 0;
		
		System.out.print(INPUT_MESSAGE + " ");
		height = scanner.nextInt();
		
		if (height <= 0) {
			System.out.println(INVALID_INPUT_MESSAGE);
			return;
		}
		
		length = height * 2 - 1;
		
		while (verticalPosition < length) {
			if ((verticalPosition < height) 
					&& (horisontalPosition <= verticalPosition) 
					|| (verticalPosition >= height) 
					&& (horisontalPosition < length - verticalPosition)) {
				System.out.print(PATTERN);
				horisontalPosition++;
				continue;				 
			} 			
			
			System.out.println();
			horisontalPosition = 0;
			verticalPosition++;			
		}
	}
}