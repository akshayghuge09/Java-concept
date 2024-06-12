package exceptions;

import java.util.Scanner;

class Voter {
	private String name;
	private String nationality;
	private int age;

	public Voter(String name, String nationality, int age) {
		this.name = name;
		this.nationality = nationality;
		this.age = age;
	}

	public void check() throws IncorrectAgeException, IncorrectNationalityException {

		if (nationality.equalsIgnoreCase("Indian")) {
			if (age < 18) {
				throw new IncorrectAgeException("You must be at least 18 years old to vote.");
			} else {
				System.out.println(name + " is eligible to vote.");
			}
		} else {
			throw new IncorrectNationalityException("Only indian citizens are eligible to vote.");
		}

	}

	@Override
	public String toString() {
		return "Voter [name=" + name + ", nationality=" + nationality + ", age=" + age + "]";
	}
}

class IncorrectAgeException extends Exception {
	public IncorrectAgeException(String message) {
		System.out.println(message);
	}
}

// Custom exception class for incorrect nationality
class IncorrectNationalityException extends Exception {
	public IncorrectNationalityException(String message) {
		System.out.println(message);
	}
}

public class UserDefineExceptions {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scanner.next();

		System.out.print("Enter your nationality: ");
		String nationality = scanner.next();

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		Voter voter = new Voter(name, nationality, age);

		try {
			voter.check();
		} catch (IncorrectAgeException | IncorrectNationalityException e) {

		}

		System.out.println(voter);

	}

}
