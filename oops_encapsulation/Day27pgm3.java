package oops_encapsulation;

//this can be used anywhere in program but this() only have to first statement of constructor
class Student3 {
	private int studentId;
	private String name;
	private float height;
	private String address;

	public Student3(int studentId, String name, float height, String address) {
		this();
		this.studentId = studentId;
		this.name = name;
		this.height = height;
		this.address = address;
	}

	public Student3() {
	}

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

public class Day27pgm3 {
	public static void main(String[] args) {
		Student3 s = new Student3();
		s.setStudentId(18);
		s.setName("Himanth");
		s.setHeight(5.10f);
		s.setAddress("Nellore");
		System.out.println(s.getStudentId() + " " + s.getName() + " " + s.getHeight() + " " + s.getAddress());

	}
}
