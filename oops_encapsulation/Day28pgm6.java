package oops_encapsulation;


//printing 3 outputs one time after taking 3 inputs by storing in using nextLine() after nextInt()
import java.util.Scanner;

class Student9 {
	private int studentId;
	private String name;
	private float height;
	private String address;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

public class Day28pgm6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of students");
		int n = scan.nextInt();
		scan.nextLine();
		
		Student9[] studentarr = new Student9[n];
		for (int i = 0; i < n; i++) {
			Student9 s = new Student9();
			System.out.println("Enter the student " +(i+1)+ " Details");
			String input = scan.nextLine();
			String[] arr = input.split(",");
			int id = Integer.parseInt(arr[0]);
			float height = Float.parseFloat(arr[2]);

			s.setStudentId(id);
			s.setName(arr[1]);
			s.setHeight(height);
			s.setAddress(arr[3]);
			studentarr[i] = s;
		}
		for (int i = 0; i <studentarr.length; i++) {
			System.out.println(studentarr[i].getStudentId() + " " + studentarr[i].getName() + " "
					+ studentarr[i].getHeight() + " " + studentarr[i].getAddress());
		}
	}
}
