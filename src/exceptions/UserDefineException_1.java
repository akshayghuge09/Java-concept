package exceptions;

import java.util.Scanner;

class Acc_info {
	String acc_name;
	int acc_no;
	double balance;

	public Acc_info() {
	}

	public Acc_info(String acc_name, int acc_no, double balance) {
		super();
		this.acc_name = acc_name;
		this.acc_no = acc_no;
		this.balance = balance;
	}

	public void Display() {
		System.out.println("Acc_info [acc_name=" + acc_name + ", acc_no=" + acc_no + ", balance=" + balance + "]");
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println(amount + " deposited successfully.");
	}

	public void withdraw(int amount) throws InsufficientFundsException {
		if (amount > balance) {

			throw new InsufficientFundsException("Insufficient balance. Withdrawal failed.");
		} else {
			balance -= amount;
			System.out.println(amount + " withdrawn successfully.");
		}
	}
}

class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
		super(message);
	}
}

public class UserDefineException_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Acc_info ac = new Acc_info("akshay", 456, 1000);
		ac.Display();
		System.out.println("Enter the amount to be deposited");
		double amt = sc.nextDouble();
		ac.deposit(amt);

		System.out.println("Enter the withdrow amount");
		int wamt = sc.nextInt();
		try {
			ac.withdraw(wamt);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();

	}

}
