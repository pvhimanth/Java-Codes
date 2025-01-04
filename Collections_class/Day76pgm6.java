package Collections_class;

import java.util.Scanner;
import java.util.TreeSet;

/* Taking input from the user sorting Employee objects based on length of name
 */
class EmployeeJ implements Comparable<EmployeeJ> {
	private int id;
	private String name;
	private String email;
	private int salary;
	private String department;

	public EmployeeJ() {
	}

	public EmployeeJ(int id, String name, String email, int salary, String department) {
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
	public int compareTo(EmployeeJ o2) {
		String name1 = this.name;
		String name2 = o2.name;

		Integer len1 = name1.length();
		Integer len2 = name2.length();
		return len1.compareTo(len2);

	}

}

public class Day76pgm6 {
	public static void main(String[] args) {
		System.out.println("Enter the number of Employees");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		TreeSet<EmployeeJ> ts = new TreeSet<EmployeeJ>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the details of " + (i + 1) + " Employee");
			String input = scan.nextLine();
			String[] arr = input.split(",");
			EmployeeJ e = new EmployeeJ(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]), arr[4]);
			ts.add(e);
		}

		System.out.println(ts);
	}
}
