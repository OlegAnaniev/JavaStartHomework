package training;

import java.util.Random;

public class RandomTriangleData extends TriangleData {
	
	private final int MIN_LENGTH = 0;
	private final int MAX_LENGTH = 100;

	@Override
	public double[] getData() {
		Random random = new Random();
		
		for	(int i = 0; i < TRIANGLE_SIDES_COUNT; i++) {
			validatedValue = random.nextDouble();
			triangleSides[i] = validatedValue * (MAX_LENGTH - MIN_LENGTH)
					+ MIN_LENGTH;			
		}	
		
		return triangleSides;
	}
}