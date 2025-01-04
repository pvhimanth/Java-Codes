package filehadling_read_write;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// reading data from one file and writing into another file
public class Day79pgm2 {
	public static void main(String[] args) {
		String path = "C:\\Java_Full_Stack\\Java_tap_academy\\data.txt";
		String path2 = "C:\\Java_Full_Stack\\Java_tap_academy\\newData.txt";

		FileReader reader = null;
		FileWriter writer = null;
		try {
			reader = new FileReader(path);
			writer = new FileWriter(path2);

			int c = reader.read();
			while (c != -1) {
				writer.write(c);
				c = reader.read();
			}
			writer.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
