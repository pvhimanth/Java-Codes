package multithreading;

// Thread class methods
public class Day59pgm3 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t); //gives thread details
		System.out.println(t.getName()); //gives name of thread
		System.out.println(t.getPriority()); //gives thread priority
		System.out.println(t.getThreadGroup()); //gives thread group details
	}
}
