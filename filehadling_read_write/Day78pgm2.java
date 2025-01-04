package filehadling_read_write;

import java.io.File;
import java.io.IOException;

public class Day78pgm2 {
	public static void main(String[] args) {

		// creating file in directory using createNewFile() method
		String path = "C:\\Java_Full_Stack\\Java_tap_academy\\FileHandling.txt";
		File file = new File(path);

		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// creating directory using mkdir() method
		String path2 = "C:\\Java_Full_Stack\\Java_tap_academy\\Filehdling";
		File file2 = new File(path2);

		file2.mkdir();

		// listing all the file and directories in another directory using list() method
		String path3 = "C:\\Java_Full_Stack\\Java_tap_academy";
		File file3 = new File(path3);

		String[] arr = file3.list();
		for (String myFiles : arr) {
			System.out.println(myFiles);
		}
	}
}
