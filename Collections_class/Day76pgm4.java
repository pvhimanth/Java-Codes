package Collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* Taking input from the user, sorting Employee objects based on id and calling compareTo method
 * of Integer class from compareTo method of Employee Class 
 */
class Employeee implements Comparable<Employeee> {
	private int id;
	private String name;
	private String email;
	private int salary;
	private String department;

	public Employeee() {
	}

	public Employeee(int id, String name, String email, int salary, String department) {
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
	public int compareTo(Employeee o2) {
		Employeee o1 = this;
		Integer id1 = o1.id;
		Integer id2 = o2.id;

		return id1.compareTo(id2);
	}

}

public class Day76pgm4 {
	public static void main(String[] args) {
		System.out.println("Enter the number of Employees");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		ArrayList<Employeee> al = new ArrayList<Employeee>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the details of " + (i + 1) + " Employee");
			String input = scan.nextLine();
			String[] arr = input.split(",");
			Employeee e = new Employeee(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]), arr[4]);
			al.add(e);
		}

		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}
