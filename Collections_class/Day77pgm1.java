package Collections_class;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/* Taking input from the user sorting Employee objects based on id using compare method from comparator interface
 */

class Demo1 implements Comparator<EmployeeO> {
	@Override
	public int compare(EmployeeO e1, EmployeeO e2) {
		Integer id1 = e1.getId();
		Integer id2 = e2.getId();

		return id1.compareTo(id2);
	}
}

class EmployeeO {
	private int id;
	private String name;
	private String email;
	private int salary;
	private String department;

	public EmployeeO() {
	}

	public EmployeeO(int id, String name, String email, int salary, String department) {
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
}

public class Day77pgm1 {
	public static void main(String[] args) {

		Demo1 d1 = new Demo1();
		System.out.println("Enter the number of Employees");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		TreeSet<EmployeeO> ts = new TreeSet<EmployeeO>(d1);

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the details of " + (i + 1) + " Employee");
			String input = scan.nextLine();
			String[] arr = input.split(",");
			EmployeeO e = new EmployeeO(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]), arr[4]);
			ts.add(e);
		}

		System.out.println(ts);
	}
}
