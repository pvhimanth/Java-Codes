package Collections_class;

import java.util.Scanner;
import java.util.TreeSet;

/* Taking input from the user sorting Employee objects based on name, if names are same 
 * the sorting based on the id , if id also same then sorting base on email
 */
class EmployeeM implements Comparable<EmployeeM> {
	private int id;
	private String name;
	private String email;
	private int salary;
	private String department;

	public EmployeeM() {
	}

	public EmployeeM(int id, String name, String email, int salary, String department) {
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
	public int compareTo(EmployeeM o2) {
		String name1 = this.name;
		String name2 = o2.name;

		Integer id1 = this.id;
		Integer id2 = o2.id;

		String email1 = this.email;
		String email2 = o2.email;

		if (name1.equals(name2) && !id1.equals(id2)) {

			return id1.compareTo(id2);
		} else if (id1.equals(id2) && !name1.equals(name2)) {
			return name1.compareTo(name2);
		} else {
			return email1.compareTo(email2);
		}
	}
}

public class Day76pgm8 {
	public static void main(String[] args) {
		System.out.println("Enter the number of Employees");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		TreeSet<EmployeeM> ts = new TreeSet<EmployeeM>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the details of " + (i + 1) + " Employee");
			String input = scan.nextLine();
			String[] arr = input.split(",");
			EmployeeM e = new EmployeeM(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]), arr[4]);
			ts.add(e);
		}

		System.out.println(ts);
	}
}
