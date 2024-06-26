package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Person {
	String name;
	String gender;
	int age;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String gender, int age) {

		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public static List<Person> create() {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Aditya", "M", 17));
		people.add(new Person("Shamal", "F", 20));
		people.add(new Person("Tarun", "M", 35));
		people.add(new Person("Zarrin", "F", 23));
		people.add(new Person("Akash", "M", 23));
		people.add(new Person("Shamal", "F", 22));
		people.add(new Person("Viraj", "M", 27));
		people.add(new Person("Tarun", "M", 19));
		return people;
	}

}
