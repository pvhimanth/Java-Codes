package Collections_class;

import java.util.ArrayList;
import java.util.Collections;

// sorting Employee objecta based on id
class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String email;
	private int salary;
	private String department;

	public Employee() {
	}

	public Employee(int id, String name, String email, int salary, String department) {
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
	public int compareTo(Employee o2) {
		Employee o1 = this;
		Integer id1 = o1.id;
		Integer id2 = o2.id;

		if (id1 > id2) {
			return 1;
		} else if (id2 > id1) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class Day76pgm1 {
	public static void main(String[] args) {

		Employee e1 = new Employee(2, "Tim", "tim@gmail.com", 100000, "It");
		Employee e2 = new Employee(1, "Steve", "steve@gmail.com", 200000, "Hr");
		Employee e3 = new Employee(3, "John", "john@gmail.com", 500000, "Manager");

		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}
