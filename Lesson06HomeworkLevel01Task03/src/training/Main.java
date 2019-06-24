package training;

public class Main {

	public static void main(String[] args) {
		final int WIDTH = 10;
		final int HEIGHT = 5;
		
		drawRectangle(WIDTH, HEIGHT);
	}
	
	/**
	 * Draws a rectangle of given width and height in console
	 * 
	 * @param width <code>int</code>
	 * @param height <code>int</code>
	 * @author Oleg
	 */
	private static void drawRectangle(int width, int height) {
		final char VISIBLE_PATTERN = '*';
		final char INVISIBLE_PATTERN = ' ';
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				if (i == 1 || j == 1 || i == height || j == width) {
					System.out.print(VISIBLE_PATTERN);
				} else {
					System.out.print(INVISIBLE_PATTERN);
				}
			}
			System.out.println();
		}
	}
}