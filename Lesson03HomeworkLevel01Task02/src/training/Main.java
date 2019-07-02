package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final int NUMBER_OF_FLOORS = 9;
		final int NUMBER_OF_ENTRANCES = 4;
		final int APPARTMENTS_PER_FLOOR = 4;
		final String INPUT_MESSAGE = "Input appartment no.:";
		final String INVALID_INPUT_MESSAGE = "Appartment does not exist";
		final String OUTPUT_ENTRANCE_MESSAGE = "Entrance:";
		final String OUTPUT_FLOOR_MESSAGE = "Floor:";		
		int totalAppartments = NUMBER_OF_FLOORS * NUMBER_OF_ENTRANCES 
				* APPARTMENTS_PER_FLOOR;
		int appartmentsPerEntrance = NUMBER_OF_FLOORS * APPARTMENTS_PER_FLOOR;
		Scanner scanner = new Scanner(System.in);
		int userInput;
		int entrance;
		int appPositionInsideEntrance;
		int floor;		
		
		System.out.print(INPUT_MESSAGE + " ");
		userInput = scanner.nextInt();
		
		if (userInput <= 0 || userInput > totalAppartments) {
			System.out.println(INVALID_INPUT_MESSAGE);
			return;
		}
		
		entrance = userInput / appartmentsPerEntrance;
		if (userInput % appartmentsPerEntrance != 0) {
			entrance++;
		}
		//entrance = (userInput - 1) / 36 + 1;		
		
		appPositionInsideEntrance = userInput - 
				(appartmentsPerEntrance * (entrance - 1));		
		floor = appPositionInsideEntrance / APPARTMENTS_PER_FLOOR;
		if (appPositionInsideEntrance % APPARTMENTS_PER_FLOOR != 0) {
			floor++;
		}
		//userInput = userInput - 36 * (access - 1);
		//floor = (number - 1) / 4 + 1;
		
		System.out.println(OUTPUT_ENTRANCE_MESSAGE + " " + entrance);
		System.out.println(OUTPUT_FLOOR_MESSAGE + " " + floor);
	}
}