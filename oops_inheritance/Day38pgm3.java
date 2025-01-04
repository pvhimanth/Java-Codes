package oops_inheritance;


//creating pojo class and overriding toString() method

class Employee2{
	private int id;
	private String name;
	private String address;
	
	public Employee2() {
		
	}

	public Employee2(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		
		return id+" "+name+" "+address;
	}

}
public class Day38pgm3 {
	public static void main(String[] args) {
		Employee2 e=new Employee2(18,"Himanth","Nellore");
		System.out.println(e);
	}

}
