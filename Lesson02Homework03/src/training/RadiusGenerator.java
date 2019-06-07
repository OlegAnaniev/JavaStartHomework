package training;

public abstract class RadiusGenerator {
	
	protected static final String NEGATIVE_VALUE_MESSAGE = 
			"Input value is not a positive double";
	protected double radius;

	public abstract double getRadius();
}
