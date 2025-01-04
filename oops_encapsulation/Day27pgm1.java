package oops_encapsulation;

//this keyword is references to only currently executing object not previous object
class Student{
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
public class Day27pgm1 {
public static void main(String[] args) {
	Student s=new Student();
	s.setStudentId(18);
	s.setName("Himanth");
	s.setHeight(5.10f);
	s.setAddress("Nellore");
	System.out.println(s.getStudentId() + " " + s.getName() + " " + 
	s.getHeight() + " " + s.getAddress());
	
	Student s2=new Student();
	s2.setStudentId(36);
	s2.setName("Tim");
	s2.setHeight(5.11f);
	s2.setAddress("New York");
	System.out.println(s2.getStudentId() + " " + s2.getName() + " " + 
	s2.getHeight() + " " + s2.getAddress());
}
}
