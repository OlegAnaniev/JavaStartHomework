package training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String path = "text.txt";
		
		saveTextToFile(path);
	}
	
	/**
	 * Saves user input to a file
	 * 
	 * @param path <code>String</code>
	 * @author Oleg
	 */
	private static void saveTextToFile(String path) {		
		
		final String INPUT_MESSAGE = 
				"Enter text (enter \"exit\" as a line to finish):";
		final String DONE_MESSAGE = "File %s saved successfully";
		String userInput;
		
		System.out.println(INPUT_MESSAGE);
		
		try (Scanner scanner = new Scanner(System.in); 
				PrintWriter text = new PrintWriter(path)){
			
			while (true) {
				userInput = scanner.nextLine();
				
				if (userInput.equalsIgnoreCase("exit")) {
					break;
				}
				
				text.println(userInput);
			}						
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(String.format(DONE_MESSAGE, path));
	}
}