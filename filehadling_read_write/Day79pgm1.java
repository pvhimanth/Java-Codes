package filehadling_read_write;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// reading all character using while loop instead of using char[] array
public class Day79pgm1 {
	public static void main(String[] args) {
		String path = "C:\\Java_Full_Stack\\Java_tap_academy\\FileHandling.txt";

		FileReader reader = null;
		try {
			reader = new FileReader(path);

			int n = reader.read();
			while (n != -1) {
				System.out.print((char) n);
				n = reader.read();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
