package training;

public class CircumferenceCalculator {
	
	private RadiusGenerator generator;
	private double radius;
	private double circumference;
	
	public CircumferenceCalculator(RadiusGenerator generator) {
		this.generator = generator;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double run() throws RadiusDataException {
		radius = generator.getRadius();
		
		if	(isRadiusValid()) {
			calculateCircumference();
			return circumference;
		} else {
			throw new 
				RadiusDataException(RadiusGenerator.NEGATIVE_VALUE_MESSAGE);
		}
	}
	
	private boolean isRadiusValid() {
		return (radius >= 0) ? true : false;
	}
	
	private void calculateCircumference() {
		circumference = 2 * Math.PI * radius;
	}
}