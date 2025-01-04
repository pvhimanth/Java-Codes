package multithreading;

//Achieving states of thread
class Warrior extends Thread {
	String res1 = "Brahmastra";
	String res2 = "Pashupatastra";
	String res3 = "Sarpastra";

	@Override
	public void run() {

		if (Thread.currentThread().getName().equals("ARJUNA")) {
			arjuna();
		}
		else {
			karna();
		}
	}

	public void arjuna() {
		try {
			Thread.sleep(5000);
			synchronized (res1) {
				System.out.println("Arjuna acquires " + res1);
				Thread.sleep(5000);
				synchronized (res2) {
					System.out.println("Arjuna acquires " + res2);
					Thread.sleep(5000);
					synchronized (res3) {
						System.out.println("Arjuna acquires " + res3);
					}
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void karna() {
		try {
			Thread.sleep(5000);
			synchronized (res1) {
				System.out.println("karna acquires " + res1);
				Thread.sleep(5000);
				synchronized (res2) {
					System.out.println("karna acquires " + res2);
					Thread.sleep(5000);
					synchronized (res3) {
						System.out.println("karna acquires " + res3);
					}
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Day64pgm1 {
	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		Warrior w2 = new Warrior();

		w1.setName("ARJUNA");
		w2.setName("KARNA");

		w1.start();
		w2.start();
	}
}
