package MultiThreading;

public class RemoteConnectionThread implements Runnable {

	void process3() {
		System.out.println("Process3");
	}

	void process4() {
		System.out.println("Process4");
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		process3();
		process4();

	}
}
