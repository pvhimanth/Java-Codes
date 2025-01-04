package multithreading;

// using join() method to execute one thread at any point of time instead using synchronized
class BathRoommm {
	void bathRoom() {
		try {
			System.out.println(Thread.currentThread().getName() + " has entered the bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " is using the bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " has exited the bathroom");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Boyyy extends Thread {

	BathRoommm bathRoom;

	@Override
	public void run() {
		bathRoom.bathRoom();
	}

	public Boyyy(BathRoommm bathRoom) {
		this.bathRoom = bathRoom;
	}
}

class Girlll extends Thread {
	BathRoommm bathRoom;

	@Override
	public void run() {
		bathRoom.bathRoom();

	}

	public Girlll(BathRoommm bathRoom) {
		this.bathRoom = bathRoom;
	}
}

class Othersss extends Thread {
	BathRoommm bathRoom;

	@Override
	public void run() {
		bathRoom.bathRoom();

	}

	public Othersss(BathRoommm bathRoom) {
		this.bathRoom = bathRoom;
	}
}

public class Day63pgm4 {
	public static void main(String[] args) {
		try {
			BathRoommm bathRoom = new BathRoommm();

			Boyyy boy = new Boyyy(bathRoom);
			Girlll girl = new Girlll(bathRoom);
			Othersss others = new Othersss(bathRoom);

			boy.setName("Boy");
			girl.setName("Girl");
			others.setName("Others");

			boy.start();
			boy.join();
			girl.start();
			girl.join();
			others.start();
			others.join();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
