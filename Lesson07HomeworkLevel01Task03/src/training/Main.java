package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String INPUT_MESSAGE = "Enter a binary int: ";
		final String OUTPUT_MESSAGE = "Decimal int: ";
		int number;
		String binaryNumber;
		Scanner scanner = new Scanner(System.in);
		
		//Correct way
		System.out.print(INPUT_MESSAGE);
		number = scanner.nextInt(2);
		System.out.println(OUTPUT_MESSAGE + number);

		//Wrong way
		binaryNumber = Integer.toBinaryString(number);
		System.out.println(OUTPUT_MESSAGE + binaryToInt(binaryNumber));		
	}
	
	/**
	 * Converts binary String into decimal int
	 * 
	 * @param binary <code>String</code>
	 * @return decimal <code>int</code>
	 * @author Oleg
	 */
	private static int binaryToInt(String binary) {
		
		int decimal = 0;
		char[] binaryArray = binary.toCharArray();
		
		for (int i = 0; i < binaryArray.length; i++) {
			decimal += (binaryArray[i] - '0') 
					* Math.pow(2, binaryArray.length - i - 1);
		}
		
		return decimal;
	}
}