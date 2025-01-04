package multithreading;

/* Creating Daemon threads with the help of Primary thread(creating daemon thread objects in
 * primary threads)
 */
class CaptainP extends Thread {
	@Override
	public void run() {
		try {
			BattingCoachP abhishek = new BattingCoachP();
			BowlingCoachP morne = new BowlingCoachP();
			abhishek.setDaemon(true);
			morne.setDaemon(true);
			abhishek.start();
			morne.start();
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
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class BattingCoachP extends Thread {
	@Override
	public void run() {
		for ( ; ; ) {
			try {
				System.out.println("BattingCoach is in the ground supporting Captain");
				Thread.sleep(2000);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class BowlingCoachP extends Thread {
	@Override
	public void run() {
		for ( ; ; ) {
			try {
				System.out.println("BowlingCoach is in the ground supporting Captain");
				Thread.sleep(2000);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Day61pgm2 {
	public static void main(String[] args) {

		CaptainP rohit = new CaptainP();
		rohit.start();
	}
}
