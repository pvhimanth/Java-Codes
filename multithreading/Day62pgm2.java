package multithreading;

// single threads using single resource(method) at any point of time
class BathRoomP {
	synchronized void bathRoom() {
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

class BoyP extends Thread {

	BathRoomP bathRoom;

	@Override
	public void run() {
		bathRoom.bathRoom();
	}

	public BoyP(BathRoomP bathRoom) {
		this.bathRoom = bathRoom;
	}
}

class GirlP extends Thread {
	BathRoomP bathRoom;

	@Override
	public void run() {
		bathRoom.bathRoom();

	}

	public GirlP(BathRoomP bathRoom) {
		this.bathRoom = bathRoom;
	}
}

class OthersP extends Thread {
	BathRoomP bathRoom;

	@Override
	public void run() {
		bathRoom.bathRoom();

	}

	public OthersP(BathRoomP bathRoom) {
		this.bathRoom = bathRoom;
	}
}

public class Day62pgm2 {
	public static void main(String[] args) {
		BathRoomP bathRoom = new BathRoomP();

		BoyP boy = new BoyP(bathRoom);
		GirlP girl = new GirlP(bathRoom);
		OthersP others = new OthersP(bathRoom);

		boy.setName("Boy");
		girl.setName("Girl");
		others.setName("Others");

		boy.start();
		girl.start();
		others.start();
	}
}
