package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int inputLength;
		int[] input;		
		int max;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the amount of numbers: ");
		inputLength = scanner.nextInt();
		
		if (inputLength > 0) {
			input = new int[inputLength];
			
			for (int i = 0; i < input.length; i++) {
				System.out.print(i + ": ");
				input[i] = scanner.nextInt();
			}
			
			max = input[0];
			for (int i = 1; i < input.length; i++) {
				if (max < input[i]) {
					max = input[i];
				}
			}
			
			System.out.println("Max: " + max);			
		} else {
			System.out.println("Invalid array length");
		}	
	}
}