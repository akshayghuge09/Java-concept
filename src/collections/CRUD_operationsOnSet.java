package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Student {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}
}

public class CRUD_operationsOnSet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Student> students = new HashSet<>();

		int n;

		System.out.print("Enter the number of students: ");
		n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Enter name and age of student " + i + ": ");
			String name = scanner.next();
			int age = scanner.nextInt();

			Student student = new Student(name, age);
			students.add(student);
		}

		System.out.println("\nStudent Information:");
		System.out.println(students.toArray());

		scanner.close();
	
	}

}
