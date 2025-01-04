package filehadling_read_write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// counting no of lines and no of characters in a file
public class Day79pgm5 {
	public static void main(String[] args) {
		String path = "C:\\Java_Full_Stack\\Java_tap_academy\\data.txt";
		int lineCount = 0;
		int characterCount = 0;

		FileReader reader = null;
		BufferedReader reader2 = null;
		try {
			reader = new FileReader(path);
			reader2 = new BufferedReader(reader);

			String line = reader2.readLine();
			while (line != null) {

				int lineLength = line.length();
				characterCount += lineLength;
				lineCount++;
				line = reader2.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(lineCount); // prints no of line in file
		System.out.println(characterCount); // prints no of characters in file
	}
}
