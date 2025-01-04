package oops_encapsulation;

//taking inputs using scanner class for encapsulation
import java.util.Scanner;

class Student4 {
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

public class Day27pgm4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student4 s = new Student4();

		System.out.println("Enter the id");
		int id = scan.nextInt();
		System.out.println("Enter the Name");
		String name = scan.next();
		System.out.println("Enter the height");
		float height = scan.nextFloat();
		System.out.println("Enter the address");
		String address = scan.next();

		s.setStudentId(id);
		s.setName(name);
		s.setHeight(height);
		s.setAddress(address);
		System.out.println(s.getStudentId() + " " + s.getName() + " " + s.getHeight() + " " + s.getAddress());
	}
}
