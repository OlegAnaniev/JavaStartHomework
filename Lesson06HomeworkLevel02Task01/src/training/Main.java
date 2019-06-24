package training;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		final String PROGRESSION_MESSAGE = "Progression:";
		final String NEXT_MEMBER_MESSAGE = "Next member: ";
		final String NOT_IDENTIFIED_MESSAGE = "Progression not identified";
		int[][] progressions = new int[9][];
		progressions[0] = new int[] { 0, 2, 4, 6, 8, 10, 12 };
		progressions[1] = new int[] { 1, 4, 7, 10, 13 };
		progressions[2] = new int[] { 1, 4, 7, 10, 11 };
		progressions[3] = new int[] { 1, 2, 4, 8, 16, 32 };
		progressions[4] = new int[] { 1, 3, 9, 27 };
		progressions[5] = new int[] { 1, 3, 9, 30 };
		progressions[6] = new int[] { 1, 4, 9, 16, 25 };
		progressions[7] = new int[] { 1, 8, 27, 64, 125 };
		progressions[8] = new int[] { 1, 8, 27, 64, 111 };
		Progression tester;
		boolean isIdentified;
		
		for (int i = 0; i < progressions.length; i++) {
			isIdentified = false;
			
			System.out.println(PROGRESSION_MESSAGE);
			System.out.println(Arrays.toString(progressions[i]));
			
			tester = new ArithmeticProgression(progressions[i]);
			if (tester.isValid()) {				
				isIdentified = true;
			} else {
				tester = new GeometricProgression(progressions[i]);
				if (tester.isValid()) {					
					isIdentified = true;
				} else {
					tester = new PowerSeries(progressions[i]);
					if (tester.isValid()) {						
						isIdentified = true;
					}
				}
			}						
			
			if (isIdentified) {
				System.out.println(NEXT_MEMBER_MESSAGE 
						+ tester.getNextMember());
			} else {
				System.out.println(NOT_IDENTIFIED_MESSAGE);
			}			
		}
	}
}