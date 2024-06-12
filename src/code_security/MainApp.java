package code_security;

public class MainApp {

	public static void main(String[] args) {
		LegalAccess ref = new LoanAccount();
		ref.m1();
		
		// we can not access methods of loanAccount class which implements legal access hence we achieved code security
		// check bu uncommenting following line
	//	ref.deposit();
	}

}
