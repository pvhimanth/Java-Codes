package assignment2_inheritance;


class Employee{
	String name;
	String Designation;
	void attendMeeting() {
		System.out.println("Attend the meeting");
	}
	void submitReport() {
		System.out.println("Submit the report");
	}
}

class Manager extends Employee{
	void performDuties() {
		System.out.println("Manager perform the duties");
	}
}
class Engineer extends Employee{
	void performDuties() {
		System.out.println("Engineer Perform the duties");
	}
}
class SalesPerson extends Employee{
	void performDuties() {
		System.out.println("SalesPerson Perform the duties");
	}
}
public class Asg2pgm7 {
	public static void main(String[] args) {
		Manager m=new Manager();
		Engineer e=new Engineer();
		SalesPerson s=new SalesPerson();
		
		m.attendMeeting();
		m.performDuties();
		m.submitReport();
		
		e.attendMeeting();
		e.performDuties();
		e.submitReport();
		
		s.attendMeeting();
		s.performDuties();
		s.submitReport();
	}
}
