package oops_encapsulation;

//declaring object inside method,initializing inside for loop -->only prints third input,first 2 inputs collected by garbage collector
import java.util.Scanner;
class Student7 {
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

public class Day28pgm2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of students");
		int n = scan.nextInt();
		Student7 s=null;
		for (int i = 0; i < n; i++) {
		     s = new Student7();
			System.out.println("Enter the Details");
			String input = scan.next();
			String[] arr = input.split(",");
			int id = Integer.parseInt(arr[0]);
			float height = Float.parseFloat(arr[2]);

			s.setStudentId(id);
			s.setName(arr[1]);
			s.setHeight(height);
			s.setAddress(arr[3]);
		}
		System.out.println(s.getStudentId() + " " + s.getName() + " " + s.getHeight() + " " + s.getAddress());
	}
}
