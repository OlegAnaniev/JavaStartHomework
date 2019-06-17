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
		
		System.out.print(INPUT_MESSAGE + " ");
		height = scanner.nextInt();
		
		if (height <= 0) {
			System.out.println(INVALID_INPUT_MESSAGE);
			return;
		}
		
		length = height * 2 - 1;
		
		for (int i = 0, j = 0; i < length; ) {
			if ((i < height) && (j <= i) 
					|| (i >= height) && (j < length - i)) {
				System.out.print(PATTERN);
				j++;
				continue;				 
			} 			
			
			System.out.println();
			j = 0;
			i++;			
		}
	}
}