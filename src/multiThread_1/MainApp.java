package multiThread_1;

public class MainApp {
	public static void main(String[] args) {

		SharedProcess ref = new SharedProcess();
		Thread t1 = new Thread(new ClientThread(ref));
		Thread t2 = new Thread(new ClientThread(ref));

		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();
	}

}
