package training;

public abstract class TriangleData {
	
	protected static final int TRIANGLE_SIDES_COUNT = 3;
	protected static final String NEGATIVE_VALUE_MESSAGE = 
			"Input value is not a positive double";
	protected double[] triangleSides = new double[TRIANGLE_SIDES_COUNT];
	protected double validatedValue;

	public abstract double[] getData();
}