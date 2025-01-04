package serialisation_deserialisation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serialization --> converting object to byte data by giving serialVersionUID by user
class Customerr implements Serializable {
	private static final long serialVersionUID = 12345678912345l;
	private String name;
	private long crn;
	transient private float balance; /* makes balance variable as transient means can't write the value
					present in balance variable instead default of balance variable type */

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

public class Day80pgm3 {
	public static void main(String[] args) {

		String path = "C:\\Java_Full_Stack\\Java_tap_academy\\serialisationPrc2.txt";
		Customerr customer = new Customerr("Ram", 569796161666l, 200000);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(customer);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
