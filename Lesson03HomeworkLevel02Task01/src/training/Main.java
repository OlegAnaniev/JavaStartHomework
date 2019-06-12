package training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String POINT_X_MESSAGE = "Enter point's x coordinate:";
		final String POINT_Y_MESSAGE = "Enter point's y coordinate:";
		final String CONFIRMATION_MESSAGE = "The point belongs to the circle";
		final String REJECT_MESSAGE = "The point does not belong to the circle";
		final double CIRCLE_CENTER_X = 0;
		final double CIRCLE_CENTER_Y = 0;
		final double RADIUS = 4;
		Scanner scanner = new Scanner(System.in);
		double pointX;
		double pointY;
		double checkTriangleSideA;
		double checkTriangleSideB;
		double checkTriangleSideC;
		
		System.out.print(POINT_X_MESSAGE + " ");
		pointX = scanner.nextDouble();
		
		System.out.print(POINT_Y_MESSAGE + " ");
		pointY = scanner.nextDouble();
		
		checkTriangleSideA = Math.abs(pointX - CIRCLE_CENTER_X);
		checkTriangleSideB = Math.abs(pointY - CIRCLE_CENTER_Y);
		checkTriangleSideC = Math.sqrt(Math.pow(checkTriangleSideA, 2) 
				+ Math.pow(checkTriangleSideB, 2));
		
		if (checkTriangleSideC <= RADIUS) {
			System.out.println(CONFIRMATION_MESSAGE);
		} else {
			System.out.println(REJECT_MESSAGE);
		}
	}
}