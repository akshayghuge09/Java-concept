package Annonymous_and_lamda;

public class MainApp {
	public static void main(String[] args) {

		Calculate add = new Addition();
		System.out.println(add.cal(10, 30));

		// anonymous class
		// we have to implement all the function of that class
		// like
		Calculate sub = new Calculate() {   //this is annonymous class and its method

			@Override
			public int cal(int a, int b) {
				return a - b;
			}
		};
		System.out.println(sub.cal(20, 40));

		// lambda expression
		// lambda operator '->'
		// right side body of method
		// left side of -> parameters

		// option 1
		Calculate div = (a, b) -> a / b;
		System.out.println(div.cal(100, 10));

		// option 2
		Calculate mul = (a, b) -> {
			return a * b;
		};
		System.out.println(mul.cal(10, 45));

		// lambda expression must be used when interface has only one abstract method
		// and this type of interface is called as functional interface
	}

}
