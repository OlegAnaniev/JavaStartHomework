package training;

import java.util.Random;

public class RandomRadiusGenerator extends RadiusGenerator {

	@Override
	public double getRadius() {
		final double MIN_RADIUS = 0.0;
		final double MAX_RADIUS = 100.0;
		Random random = new Random();
		
		radius = random.nextDouble() * (MAX_RADIUS - MIN_RADIUS) + MIN_RADIUS;
		
		return radius;
	}
}