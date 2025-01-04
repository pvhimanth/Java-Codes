package Collections_class;

import java.util.ArrayList;
import java.util.Collections;

// sorting Employee objects based on name and calling compareTo method of String class from compareTo method of Employee class
class EmployeeQ implements Comparable<EmployeeQ> {
	private int id;
	private String name;
	private String email;
	private int salary;
	private String department;

	public EmployeeQ() {
	}

	public EmployeeQ(int id, String name, String email, int salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + email + " " + salary + " " + department;
	}

	@Override
	public int compareTo(EmployeeQ o2) {
		EmployeeQ o1 = this;
		String name1 = o1.name;
		String name2 = o2.name;

		return name1.compareTo(name2);
	}

}

public class Day76pgm3 {
	public static void main(String[] args) {

		EmployeeQ e1 = new EmployeeQ(2, "Tim", "tim@gmail.com", 100000, "It");
		EmployeeQ e2 = new EmployeeQ(1, "Steve", "steve@gmail.com", 200000, "Hr");
		EmployeeQ e3 = new EmployeeQ(3, "John", "john@gmail.com", 500000, "Manager");

		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}
