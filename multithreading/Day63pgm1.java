package multithreading;

/* some statements are executed by multiple threads and some statement are in lock state using
 * synchronized block
 */
class BathRoomm {
	void bathRoom() {
		try {
			System.out.println(Thread.currentThread().getName() + " is executing statement 1");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " is executing statement 2");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " is executing statement 3");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " is executing statement 4");
			Thread.sleep(2000);
			synchronized (this) {
				System.out.println(Thread.currentThread().getName() + " is executing statement 5");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + " is executing statement 6");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + " is executing statement 7");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + " is executing statement 8");
				Thread.sleep(2000);
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Boyy extends Thread {

	BathRoomm bathRoom;

	@Override
	public void run() {
		bathRoom.bathRoom();
	}

	public Boyy(BathRoomm bathRoom) {
		this.bathRoom = bathRoom;
	}
}

class Girll extends Thread {
	BathRoomm bathRoom;

	@Override
	public void run() {
		bathRoom.bathRoom();

	}

	public Girll(BathRoomm bathRoom) {
		this.bathRoom = bathRoom;
	}
}

class Otherss extends Thread {
	BathRoomm bathRoom;

	@Override
	public void run() {
		bathRoom.bathRoom();

	}

	public Otherss(BathRoomm bathRoom) {
		this.bathRoom = bathRoom;
	}
}

public class Day63pgm1 {
	public static void main(String[] args) {
		BathRoomm bathRoom = new BathRoomm();

		Boyy boy = new Boyy(bathRoom);
		Girll girl = new Girll(bathRoom);
		Otherss others = new Otherss(bathRoom);

		boy.setName("Boy");
		girl.setName("Girl");
		others.setName("Others");

		boy.start();
		girl.start();
		others.start();
	}
}
