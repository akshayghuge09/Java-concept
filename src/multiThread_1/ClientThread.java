package multiThread_1;

public class ClientThread implements Runnable {

	SharedProcess r;

	public ClientThread() {
		// TODO Auto-generated constructor stub
	}

	public ClientThread(SharedProcess r) {

		this.r = r;
	}

	public void run() {

		try {
			r.calculate();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
