package filehadling_read_write;

import java.io.PrintWriter;
import java.util.Scanner;

/* writing data in to file using print() and println() method of PrintWriter class helps to write
 * data into false as it is given not converts to equivalent ASCII character
 */
public class Day79pgm8 {
	public static void main(String[] args) {
		String path = "C:\\Java_Full_Stack\\Java_tap_academy\\printWriterPrc.txt";
		PrintWriter writer = null;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the values");
		int i = scan.nextInt();
		float f = scan.nextFloat();
		boolean b = scan.nextBoolean();
		long l = scan.nextLong();
		String s = scan.next();

		try {

			writer = new PrintWriter(path);
			writer.print(i); // print() methods writes data in same line everytime
			writer.print(f);
			writer.print(b);
			writer.println(l); // println() method writes data in separate line everytime
			writer.println(s);
			writer.write(65); // write() method works same as in BufferWriter
			writer.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
