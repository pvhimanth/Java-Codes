package multithreading;

/* Creating Daemon threads with the help of Primary thread(creating daemon thread objects in
 * primary threads)
 */
class Hero extends Thread {
	@Override
	public void run() {
		try {
			MakeUpArtist james = new MakeUpArtist();
			LightMan sam = new LightMan();
			james.setDaemon(true);
			sam.setDaemon(true);
			james.start();
			sam.start();
			System.out.println("Hero has entered the cinema set");
			Thread.sleep(2000);
			System.out.println("Hero will  meet director");
			Thread.sleep(2000);
			System.out.println("Hero will read the script");
			Thread.sleep(2000);
			System.out.println("Hero will do rehearsal");
			Thread.sleep(2000);
			System.out.println("Hero will do act in the scene");
			Thread.sleep(2000);
			System.out.println("Hero will go to hotel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MakeUpArtist extends Thread {
	@Override
	public void run() {
		for (;;) {
			try {
				System.out.println("MakeUpArtist is in set doing makeup to hero");
				Thread.sleep(2000);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class LightMan extends Thread {
	@Override
	public void run() {
		for (;;) {
			try {
				System.out.println("LightMan is in the set supporting hero");
				Thread.sleep(2000);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Day61pgm3 {
	public static void main(String[] args) {

		Hero prabhas = new Hero();
		prabhas.start();
	}
}
