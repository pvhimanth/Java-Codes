package filehadling_read_write;

import java.io.File;

// Methods of a File class
public class Day78pgm1 {
	public static void main(String[] args) {
		String path = "C:\\Java_Full_Stack\\Java_tap_academy\\data.txt";
		File file = new File(path);

		// exists() method
		System.out.println(file.exists());
		
		// canRead() method
		System.out.println(file.canRead());
		
		// canWrite() method
		System.out.println(file.canWrite());
		
		// getName() method
		System.out.println(file.getName());
		
		// getParent() method
		System.out.println(file.getParent());
		
		// getAbsolutePath() method
		System.out.println(file.getAbsolutePath());
		
		// getAbsoluteFile() method
		System.out.println(file.getAbsoluteFile());
		
		// isFile() method
		System.out.println(file.isFile());
		
		// isDirectory() method
		System.out.println(file.isDirectory());

	}
}
