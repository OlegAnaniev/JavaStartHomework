package training;

import java.io.File;

public class Main {	
	
	private static final String SEPATAROR_INDENT = "\t";

	public static void main(String[] args) {
		
		final String OUTPUT_MESSAGE = "List of %s subfolders:";
		final String PATH = ".";		
		final String SEPARATOR = "--->";
		File currentFolder = new File(PATH);
		
		System.out.println(String.format(OUTPUT_MESSAGE, 
				currentFolder.getAbsolutePath()));
		displayFolderTree(currentFolder, SEPARATOR);

	}
	
	/**
	 * Recursively displays subfolders of a given folder 
	 * 
	 * @param currentFolder <code>File</code>
	 * @param separator <code>String</code> displays nesting level
	 * @author Oleg
	 */
	private static void displayFolderTree (File currentFolder, 
			String separator) {
		
		File[] currentFolderContent = currentFolder.listFiles();
		
		for (File item : currentFolderContent) {
			if (item.isDirectory()) {
				System.out.println(separator + item.getName());
				displayFolderTree(item, SEPATAROR_INDENT + separator);
			}
		}		
	}
}