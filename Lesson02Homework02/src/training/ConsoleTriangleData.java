package training;

import java.util.Scanner;

public class ConsoleTriangleData extends TriangleData {	
	
	private final String WELLCOME_MESSAGE = "Triangle";
	private final String INPUT_MESSAGE_HEAD = "Input side";
	private final String INPUT_MESSAGE_TAIL = 
			"length (positive double) and press Enter: ";	
	private final String INVALID_FORMAT_MESSAGE = "Input value is not double";	

	@Override
	public double[] getData() {		
		Scanner scanner = new Scanner(System.in);
		String tempValue;
		
		System.out.println(WELLCOME_MESSAGE);
		
		char c = 97;
		for (int i = 0; i < TRIANGLE_SIDES_COUNT; c++, i++) {
			System.out.print(INPUT_MESSAGE_HEAD + " " + c + " " 
					+ INPUT_MESSAGE_TAIL);
			tempValue = scanner.nextLine();			
			
			try {
				validateInput(tempValue);
			} catch (InputFormatException e) {
				System.out.println(e.getMessage());
				c--;
				i--;
				continue;
			}
			
			triangleSides[i] = validatedValue;			
		}
		
		return triangleSides;
	}
	
	private void validateInput(String tempValue) throws InputFormatException {		
		try {
			validatedValue = Double.parseDouble(tempValue);
		} catch (NumberFormatException e) {
			throw new InputFormatException(INVALID_FORMAT_MESSAGE);
		}
		
		if (validatedValue < 0) {
			throw new InputFormatException(NEGATIVE_VALUE_MESSAGE);
		}		
	}
}