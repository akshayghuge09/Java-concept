package MultiThreading;

public class ThreadDemo1 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new UIThread());
		Thread t2 = new Thread(new RemoteConnectionThread());

		t1.setName("Thread1");
		t2.setName("Thread2");
		Thread t3 = new Thread(new ThreadDemo1());
		Thread t4 = new Thread(new ThreadDemo1());
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Theard3");
		t4.setName("Theard4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		t1.join();
		t2.join();
		System.out.println(Thread.currentThread().getName());
		process5to7();
	}

	// override
	public void run() {
		if (Thread.currentThread().getName().equals("Thread3")) {
			System.out.println("Thread 3 is running");
			process1();

			process2();
		}
		if (Thread.currentThread().getName().equals("Thread4")) {
			System.out.println("Thread 4 is running");
			process3();
			process4();
		}

	}

	void process1() {
		System.out.println("Process1");
	}

	void process2() {
		System.out.println("Process2");
	}

	void process3() {
		System.out.println("Process3");
	}

	void process4() {
		System.out.println("Process4");
	}

	static void process5to7() {
		System.out.println("Process5 to 7");
	}

}
