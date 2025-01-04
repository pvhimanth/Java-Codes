package filehadling_read_write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* reading data using BufferedReader with help of readLine() method to read a single line completely
 * at a time not as character by character like FileReader
 */
public class Day79pgm3 {
	public static void main(String[] args) {
		String path = "C:\\Java_Full_Stack\\Java_tap_academy\\data.txt";

		FileReader reader = null;
		BufferedReader reader2 = null;
		try {
			reader = new FileReader(path);
			reader2 = new BufferedReader(reader);

			String line = reader2.readLine();
			System.out.println(line); // Data From File 1
			System.out.println(reader2.readLine()); // Hello World

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
