package filehadling_read_write;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day78pgm5 {
	public static void main(String[] args) {
		String path = "C:\\Java_Full_Stack\\Java_tap_academy\\FileHandling.txt";

		char[] arr = new char[100];
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			System.out.println(reader.read()); // 80
			System.out.println(reader.read()); // 118
			System.out.println((char) reader.read()); // H
			System.out.println(reader.read(arr)); // 48
			System.out.println(reader.read()); /* -1 as file already read completely to array the cursor
			 is at end of file , as there no data to read returns -1*/
			System.out.println(arr); // PvHimanthNellorehimanthpv7#gmail.com6302702694India
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
