package MultiThreading;

public class UIThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		process1();
		process2();
	}

	void process1() {
		System.out.println("Process1");
	}

	void process2() {
		System.out.println("Process2");
	}

}
