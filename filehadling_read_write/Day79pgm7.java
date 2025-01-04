package filehadling_read_write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/*we can't able to write values apart from int, String, char[] array type using write() method of 
 * BufferReader , if we try to write another value cause Error and integer values not be stored as
 * int values instead write into file of equivalent ASCII character
 */
public class Day79pgm7 {
	public static void main(String[] args) {
		String path = "C:\\Java_Full_Stack\\Java_tap_academy\\bufferwriterPrc.txt";
		FileWriter writer = null;
		BufferedWriter writer2 = null;
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
//		float f = scan.nextFloat();
//		boolean b=scan.nextBoolean();
		try {

			writer = new FileWriter(path);
			writer2 = new BufferedWriter(writer);
			writer2.write(i);
//			writer2.write(f); --> ERROR 
//			writer2.write(b); --> ERROR 
			writer2.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
