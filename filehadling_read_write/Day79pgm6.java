package filehadling_read_write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// reading data from two files and writing into another file
public class Day79pgm6 {
	public static void main(String[] args) {
		String path = "C:\\Java_Full_Stack\\Java_tap_academy\\data1.txt";
		String path2 = "C:\\Java_Full_Stack\\Java_tap_academy\\data2.txt";
		String path3 = "C:\\Java_Full_Stack\\Java_tap_academy\\data3.txt";

		FileReader fr1 = null;
		BufferedReader br1 = null;
		FileReader fr2 = null;
		BufferedReader br2 = null;

		FileWriter writer = null;
		try {
			fr1 = new FileReader(path);
			br1 = new BufferedReader(fr1);
			fr2 = new FileReader(path2);
			br2 = new BufferedReader(fr2);
			writer = new FileWriter(path3);

			String line1 = br1.readLine();
			String line2 = br2.readLine();
			while (line1 != null) {
				System.out.println(line1 + " : " + line2);
				writer.write(line1 + " : " + line2 + "\n");
				line1 = br1.readLine();
				line2 = br2.readLine();
			}
			writer.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
