package Collections_class;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/* Taking input from the user sorting Employee objects using compare method from comparator interface
 */

// To sort base on id in asc order
class Demo11 implements Comparator<EmployeeD> {
	@Override
	public int compare(EmployeeD e1, EmployeeD e2) {
		Integer id1 = e1.getId();
		Integer id2 = e2.getId();

		return id1.compareTo(id2);
	}
}

//To sort base on id in desc order
class Demo2 implements Comparator<EmployeeD> {
	@Override
	public int compare(EmployeeD e1, EmployeeD e2) {
		Integer id1 = e1.getId();
		Integer id2 = e2.getId();

		return -1 * id1.compareTo(id2);
	}
}

//To sort base on name
class Demo3 implements Comparator<EmployeeD> {
	@Override
	public int compare(EmployeeD e1, EmployeeD e2) {
		String name1 = e1.getName();
		String name2 = e2.getName();

		return name1.compareTo(name2);
	}
}

//To sort base on email
class Demo4 implements Comparator<EmployeeD> {
	@Override
	public int compare(EmployeeD e1, EmployeeD e2) {
		String email1 = e1.getEmail();
		String email2 = e2.getEmail();

		return email1.compareTo(email2);
	}
}

//To sort base on salary
class Demo5 implements Comparator<EmployeeD> {
	@Override
	public int compare(EmployeeD e1, EmployeeD e2) {
		Integer salary1 = e1.getSalary();
		Integer salary2 = e2.getSalary();

		return salary1.compareTo(salary2);
	}
}

//To sort base on department
class Demo6 implements Comparator<EmployeeD> {
	@Override
	public int compare(EmployeeD e1, EmployeeD e2) {
		String dept1 = e1.getDepartment();
		String dept2 = e2.getDepartment();

		return dept1.compareTo(dept2);
	}
}

class EmployeeD {
	private int id;
	private String name;
	private String email;
	private int salary;
	private String department;

	public EmployeeD() {
	}

	public EmployeeD(int id, String name, String email, int salary, String department) {
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

public class Day77pgm2 {
	public static void main(String[] args) {

		Demo11 d1 = new Demo11();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		Demo4 d4 = new Demo4();
		Demo5 d5 = new Demo5();
		Demo6 d6 = new Demo6();

		Scanner scan = new Scanner(System.in);

		System.out.println(
				"Sort based on: \n 1.Id(L to H) \n 2.Id(H to L) \n 3.Name \n 4.Email \n 5.Salary \n 6.Department");
		System.out.println("Enter the option: ");
		int option = scan.nextInt();

		TreeSet<EmployeeD> ts = null;
		if (option == 1) {
			ts = new TreeSet<EmployeeD>(d1);
		} else if (option == 2) {
			ts = new TreeSet<EmployeeD>(d2);
		} else if (option == 3) {
			ts = new TreeSet<EmployeeD>(d3);
		} else if (option == 4) {
			ts = new TreeSet<EmployeeD>(d4);
		} else if (option == 5) {
			ts = new TreeSet<EmployeeD>(d5);
		} else if (option == 6) {
			ts = new TreeSet<EmployeeD>(d6);
		} else {
			System.out.println("Invalid Input");
			System.exit(0);
		}

		System.out.println("Enter the number of Employees");
		int n = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the details of " + (i + 1) + " Employee");
			String input = scan.nextLine();
			String[] arr = input.split(",");
			EmployeeD e = new EmployeeD(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]), arr[4]);
			ts.add(e);
		}

		System.out.println(ts);
	}
}
