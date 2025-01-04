package serialisation_deserialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

// Deserialization --> converting byte data to object

/*
 * Don't need to create class Customer another time as already exists in this package in Day80pgm1 code
 * 
class Customer implements Serializable {
	private String name;
	private long crn;
	private float balance;

	public Customerr(String name, long crn, float balance) {
		super();
		this.name = name;
		this.crn = crn;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCrn() {
		return crn;
	}

	public void setCrn(long crn) {
		this.crn = crn;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

}
*/

public class Day80pgm2 {
	public static void main(String[] args) {

		String path = "C:\\Java_Full_Stack\\Java_tap_academy\\serialisationPrc.txt";

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);

			Customer customer = (Customer) ois.readObject();

			System.out.println(customer.getName());
			System.out.println(customer.getCrn());
			System.out.println(customer.getBalance());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
