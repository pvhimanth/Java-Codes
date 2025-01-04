package multithreading;

// Multiple threads using same resource(method) at any point of time
class BathRoom {
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

class Boy extends Thread {

	BathRoom bathRoom;

	@Override
	public void run() {
		bathRoom.bathRoom();
	}

	public Boy(BathRoom bathRoom) {
		this.bathRoom = bathRoom;
	}
}

class Girl extends Thread {
	BathRoom bathRoom;

	@Override
	public void run() {
		bathRoom.bathRoom();

	}

	public Girl(BathRoom bathRoom) {
		this.bathRoom = bathRoom;
	}
}

class Others extends Thread {
	BathRoom bathRoom;

	@Override
	public void run() {
		bathRoom.bathRoom();

	}

	public Others(BathRoom bathRoom) {
		this.bathRoom = bathRoom;
	}
}

public class Day62pgm1 {
	public static void main(String[] args) {
		BathRoom bathRoom = new BathRoom();

		Boy boy = new Boy(bathRoom);
		Girl girl = new Girl(bathRoom);
		Others others = new Others(bathRoom);

		boy.setName("Boy");
		girl.setName("Girl");
		others.setName("Others");

		boy.start();
		girl.start();
		others.start();
	}
}
