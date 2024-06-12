package code_security;

public class LoanAccount implements LegalAccess {

	@Override
	public void m1() {
		System.out.println("m1 from loan Account");

	}

	void deposit() {
		System.out.println("Deposit money to my account");
	}

}
