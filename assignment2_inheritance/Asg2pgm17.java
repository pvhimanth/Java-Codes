package assignment2_inheritance;

class EmployeeD {
	private String employeeId;
	private String name;
	private String position;

	public EmployeeD(String employeeId, String name, String position) {
		this.employeeId = employeeId;
		this.name = name;
		this.position = position;
	}

	public EmployeeD() {
		this("G24569", "Himanth", "SWE-1");
		System.out.println("EmployeeId: " + employeeId);
		System.out.println("name: " + name);
		System.out.println("Position: " + position);
	}
}

class ManagerD extends EmployeeD {
	String department = "IT";

	public ManagerD() {
		System.out.println("Department: " + department);
	}
}

public class Asg2pgm17 {
	public static void main(String[] args) {
		ManagerD c = new ManagerD();

	}
}
