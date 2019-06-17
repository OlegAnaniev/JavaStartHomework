package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String WIDTH_INPUT_MESSAGE = "Enter width:";
		final String HEIGHT_INPUT_MESSAGE = "Enter height:";
		final String INVALID_INPUT_MESSAGE = "Width and height must be positive";
		final String FILL_PATTERN = "*";
		final String EMPTY_PATTERN = " ";
		Scanner scanner = new Scanner(System.in);
		int width;
		int height;
		
		System.out.print(WIDTH_INPUT_MESSAGE + " ");
		width = scanner.nextInt();
		
		System.out.print(HEIGHT_INPUT_MESSAGE + " ");
		height = scanner.nextInt();
		
		if (width <= 0 || height <= 0) {
			System.out.println(INVALID_INPUT_MESSAGE);
			return;
		}
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 0 || j == 0 || i == height - 1 || j == width - 1) {
					System.out.print(FILL_PATTERN);
				} else {
					System.out.print(EMPTY_PATTERN);
				}
			}
			System.out.println();
		}
	}
}