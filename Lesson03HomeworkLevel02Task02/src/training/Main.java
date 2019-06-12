package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String POINT_X_MESSAGE = "Enter point's x coordinate:";
		final String POINT_Y_MESSAGE = "Enter point's y coordinate:";
		final String CONFIRMATION_MESSAGE = "The point belongs to the triangle";
		final String REJECT_MESSAGE = "The point does not belong to the triangle";
		final double TRIANGLE_VERTEX_A_X = 0;
		final double TRIANGLE_VERTEX_A_Y = 0;
		final double TRIANGLE_VERTEX_B_X = 4;
		final double TRIANGLE_VERTEX_B_Y = 4;
		final double TRIANGLE_VERTEX_C_X = 6;
		final double TRIANGLE_VERTEX_C_Y = 1;
		Scanner scanner = new Scanner(System.in);
		double pointX;
		double pointY;
		double turnA;
		double turnB;
		double turnC;
		
		System.out.print(POINT_X_MESSAGE + " ");
		pointX = scanner.nextDouble();
		
		System.out.print(POINT_Y_MESSAGE + " ");
		pointY = scanner.nextDouble();
		
		turnA = (TRIANGLE_VERTEX_A_X - pointX) 
				* (TRIANGLE_VERTEX_B_Y - TRIANGLE_VERTEX_A_Y)
				- (TRIANGLE_VERTEX_B_X - TRIANGLE_VERTEX_A_X)
				* (TRIANGLE_VERTEX_A_Y - pointY);
		turnB = (TRIANGLE_VERTEX_B_X - pointX) 
				* (TRIANGLE_VERTEX_C_Y - TRIANGLE_VERTEX_B_Y)
				- (TRIANGLE_VERTEX_C_X - TRIANGLE_VERTEX_B_X)
				* (TRIANGLE_VERTEX_B_Y - pointY);
		turnC = (TRIANGLE_VERTEX_C_X - pointX) 
				* (TRIANGLE_VERTEX_A_Y - TRIANGLE_VERTEX_C_Y)
				- (TRIANGLE_VERTEX_A_X - TRIANGLE_VERTEX_C_X)
				* (TRIANGLE_VERTEX_C_Y - pointY);
		
		if ((turnA >= 0 && turnB >= 0 && turnC >= 0) 
				|| (turnA <= 0 && turnB <= 0 && turnC <= 0)) {
			System.out.println(CONFIRMATION_MESSAGE);
		} else {
			System.out.println(REJECT_MESSAGE);
		}
	}
}