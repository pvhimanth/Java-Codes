package Collections_class;

import java.util.ArrayList;
import java.util.Collections;

// sorting Employee objects based on id and calling compareTo method of Integer class from compareTo method of Employee class
class EmployeeP implements Comparable<EmployeeP> {
	private int id;
	private String name;
	private String email;
	private int salary;
	private String department;

	public EmployeeP() {
	}

	public EmployeeP(int id, String name, String email, int salary, String department) {
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
	public int compareTo(EmployeeP o2) {
		EmployeeP o1 = this;
		Integer id1 = o1.id;
		Integer id2 = o2.id;

		return id1.compareTo(id2);
	}

}

public class Day76pgm2 {
	public static void main(String[] args) {

		EmployeeP e1 = new EmployeeP(2, "Tim", "tim@gmail.com", 100000, "It");
		EmployeeP e2 = new EmployeeP(1, "Steve", "steve@gmail.com", 200000, "Hr");
		EmployeeP e3 = new EmployeeP(3, "John", "john@gmail.com", 500000, "Manager");

		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}
