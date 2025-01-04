package Collections_class;

import java.util.Scanner;
import java.util.TreeSet;

/* Taking input from the use sorting Employee objects based on name, if names are same 
 * the sorting based on the id
 */
class EmployeeT implements Comparable<EmployeeT> {
	private int id;
	private String name;
	private String email;
	private int salary;
	private String department;

	public EmployeeT() {
	}

	public EmployeeT(int id, String name, String email, int salary, String department) {
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
	public int compareTo(EmployeeT o2) {
		EmployeeT o1 = this;
		String name1 = o1.name;
		String name2 = o2.name;

		/**
		 * if two names are equal then duplicates can't be store in TreeSet , so newly
		 * entered duplicate data will be stored in TreeSet Enter the number of
		 * Employees 2 Enter the details of 1 Employee 25,Sam,sam@gmail.com,66000,Sales
		 * Enter the details of 2 Employee 25,Ram,ram@mail.com,55313,Manager
		 * output-----> [25 Sam sam@gmail.com 66000 Sales]
		 * 
		 */

		if (name1.equals(name2)) {
			Integer id1 = o1.id;
			Integer id2 = o2.id;
			return id1.compareTo(id2);
		} else {
			return name1.compareTo(name2);
		}
	}

}

public class Day76pgm5 {
	public static void main(String[] args) {
		System.out.println("Enter the number of Employees");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		TreeSet<EmployeeT> ts = new TreeSet<EmployeeT>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the details of " + (i + 1) + " Employee");
			String input = scan.nextLine();
			String[] arr = input.split(",");
			EmployeeT e = new EmployeeT(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]), arr[4]);
			ts.add(e);
		}

		System.out.println(ts);

	}
}
