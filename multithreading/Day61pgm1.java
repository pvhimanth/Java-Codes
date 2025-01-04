package multithreading;

/*Here hepler(Daemon) threads acts as primary threads as primary thread not created daemon threads
 * (Creating objects of daemon thread in primary thread)
 */
class Captain extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("Captain has entered the ground");
			Thread.sleep(2000);
			System.out.println("Captain will do warm-up");
			Thread.sleep(2000);
			System.out.println("Captain will do fielding practice");
			Thread.sleep(2000);
			System.out.println("Captain will do bowling practice");
			Thread.sleep(2000);
			System.out.println("Captain will do batting practice");
			Thread.sleep(2000);
			System.out.println("Captain will go to hotel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class BattingCoach extends Thread {
	@Override
	public void run() {
		for (;;) {
			try {
				System.out.println("BattingCoach is in the ground supporting Captain");
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class BowlingCoach extends Thread {
	@Override
	public void run() {
		for (;;) {
			try {
				System.out.println("BowlingCoach is in the ground supporting Captain");
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Day61pgm1 {
	public static void main(String[] args) {
		Captain rohit = new Captain();
		BattingCoach abhishek = new BattingCoach();
		BowlingCoach morne = new BowlingCoach();

		rohit.start();
		abhishek.start();
		morne.start();
	}
}
