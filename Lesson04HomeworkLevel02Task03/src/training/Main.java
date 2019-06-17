package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		final String INPUT_MESSAGE = "Enter hourglass size (odd positive integer):";
		final String NEGATIVE_INVALID_INPUT_MESSAGE = "Size must be positive";
		final String EVEN_INVALID_INPUT_MESSAGE = "Size must be odd";
		final String VISIBLE_PATTERN = "*";
		final String INVISIBLE_PATTERN = " ";
		Scanner scanner = new Scanner(System.in);
		int size;
		
		System.out.print(INPUT_MESSAGE + " ");
		size = scanner.nextInt();
		
		if (size <= 0) {
			System.out.println(NEGATIVE_INVALID_INPUT_MESSAGE);
			return;
		}
		
		if (size % 2 == 0) {
			System.out.println(EVEN_INVALID_INPUT_MESSAGE);
			return;
		}
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (j >= i && j < size - i || j <= i && j >= size - i - 1) {
					System.out.print(VISIBLE_PATTERN);
				} else {
					System.out.print(INVISIBLE_PATTERN);
				}
			}
			
			System.out.println();
		}
	}
}