package multiThread_1;

import java.util.Scanner;

public class SharedProcess {

	int x;

	void calculate() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println(Thread.currentThread().getName() + " Is running");

		System.out.println("Enter value of x");

		int c;
		synchronized (this) {
			c = sc.nextInt();
		}
		x = c;
		// Thread.sleep(3000);
		System.out.println("Value of x: " + x);
	}

}
