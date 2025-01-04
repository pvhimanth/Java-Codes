package filehadling_read_write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* reading data using BufferedReader with help of readLine() method to read a single line completely
 * at a time not as character by character like FileReader 
 * And to us while loop so that readLine() statement can't be repeat multiple times
 */
public class Day79pgm4 {
	public static void main(String[] args) {
		String path = "C:\\Java_Full_Stack\\Java_tap_academy\\data.txt";
		int lineCount = 0;

		FileReader reader = null;
		BufferedReader reader2 = null;
		try {
			reader = new FileReader(path);
			reader2 = new BufferedReader(reader);

			String line = reader2.readLine();
			while (line != null) {
				System.out.println(line);
				lineCount++;
				line = reader2.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(lineCount); // prints no of line in file
	}
}
