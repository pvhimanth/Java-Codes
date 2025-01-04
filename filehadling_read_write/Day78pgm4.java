package filehadling_read_write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// writing to file and storing inside file not by overriding previous data every time execute with new data
public class Day78pgm4 {
	public static void main(String[] args) {
		String path = "C:\\Java_Full_Stack\\Java_tap_academy\\FileHandling.txt";
//		File file = new File(path);
		Scanner scan = new Scanner(System.in);

		FileWriter writer = null;
		try {
			String s1 = scan.next();
			String s2 = scan.next();
			String s3 = scan.next();

//			writer = new FileWriter(file);
			writer = new FileWriter(path, true);
			writer.append(s1);
			writer.append(s2);
			writer.append(s3);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			scan.close();
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
