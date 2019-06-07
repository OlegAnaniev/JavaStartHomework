package training;

public class TriangleSpaceCalculator {
	
	private final String INVALID_ARRAY_LENGTH_MESSAGE = 
			"Triangle has 3 sides. Provided:";
	private final String NEGATIVE_VALUE_MESSAGE_TAIL = ": ";	
	private final String NON_EXISTANT_TRIANGLE_MESSAGE = 
			"Triangle with provided side lengths does not exist";
	private final int TRIANGLE_SIDE_A_INDEX = 0;
	private final int TRIANGLE_SIDE_B_INDEX = 1;
	private final int TRIANGLE_SIDE_C_INDEX = 2;	
	private TriangleData triangleData;
	private double[] triangleSides;
	
	public TriangleSpaceCalculator(TriangleData triangleData) {
		this.triangleData = triangleData;		
	}
	
	public void setTriangleSides() {
		triangleSides = triangleData.getData();
	}
	
	public double[] getTriangleSides() {
		return triangleSides;
	}
	
	public double run() throws TriangleDataException {
		
		isDatavalid();
		return calculateSpace();
	}
	
	private boolean isDatavalid() throws TriangleDataException {		
		StringBuilder errorMessage = new StringBuilder();
		
		if	(triangleSides.length > TriangleData.TRIANGLE_SIDES_COUNT) {
			throw new TriangleDataException(INVALID_ARRAY_LENGTH_MESSAGE + " " 
					+ triangleSides.length);
		}
		
		for	(int i = 0; i < TriangleData.TRIANGLE_SIDES_COUNT; i++) {
			if	(triangleSides[i] < 0) {
				errorMessage.append(TriangleData.NEGATIVE_VALUE_MESSAGE + " " 
						+ NEGATIVE_VALUE_MESSAGE_TAIL);
			}
		}
		
		if	(errorMessage.length() > 0) {
			throw new TriangleDataException(errorMessage.toString());
		}
		
		if	(!isTriangleExistant()) {
			throw new TriangleDataException(NON_EXISTANT_TRIANGLE_MESSAGE);
		}
		
		return true;
	}
	
	private boolean isTriangleExistant() {
		double sideA = triangleSides[TRIANGLE_SIDE_A_INDEX];
		double sideB = triangleSides[TRIANGLE_SIDE_B_INDEX];
		double sideC = triangleSides[TRIANGLE_SIDE_C_INDEX];
		
		if	(sideA + sideB < sideC || sideB + sideC < sideA 
				|| sideA + sideC < sideB) {
			return false;
		} else {
			return true;
		}
	}
	
	private double calculateSpace() {
		double halfPeremeter;
		double space;
		
		halfPeremeter = (triangleSides[TRIANGLE_SIDE_A_INDEX] 
				+ triangleSides[TRIANGLE_SIDE_B_INDEX]
				+ triangleSides[TRIANGLE_SIDE_C_INDEX]) / 2;
		space = Math.sqrt(halfPeremeter 
				* (halfPeremeter - triangleSides[TRIANGLE_SIDE_A_INDEX])
				* (halfPeremeter - triangleSides[TRIANGLE_SIDE_B_INDEX])
				* (halfPeremeter - triangleSides[TRIANGLE_SIDE_C_INDEX]));
		
		return space;
	}	
}