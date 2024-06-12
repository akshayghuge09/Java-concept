package inheritance;

import java.util.Scanner;

public class MainApp {
	public static void main(String arg[]) {
		Developers d = new Developers(101, "Suvarna", 30000, "Java");
		d.calSalary();

		Employee e = new Employee(1, "Abhay", 45000);
		e.calSalary();

//  jiska object uski method
		Employee e1 = new Developers(201, "Kunta", 20000, "CPP");
		e1.calSalary();

// we can not create parent object using child class

		// Developers d1 = new Employee(202,"Diksha",45000);

		System.out.println("Enter choice");
		System.out.println("1. Developer \n 2. Tester ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		Employee ref = null;
		if (choice == 1) {
			ref = new Developers(101, "Komal", 50000, "Java");
			ref.calSalary();
		} else {
			ref = new Tester(18, "ABC", 10000, 50);
			ref.calSalary();

		}
		Services obj = new Services();
		obj.PrintSalary(ref);
		
		sc.close();

	}

}
