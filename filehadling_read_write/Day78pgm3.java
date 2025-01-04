package filehadling_read_write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// writing to file using append() method from FileWriter Class
public class Day78pgm3 {
	public static void main(String[] args) {
		String path = "C:\\Java_Full_Stack\\Java_tap_academy\\FileHandling.txt";
		File file = new File(path);

		FileWriter writer = null;
		try {
			writer = new FileWriter(file);
			writer.append("Hello World");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
