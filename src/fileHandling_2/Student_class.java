package fileHandling_2;

import java.io.Serializable;

//serializable is marker interface which can not have  abstract methods
public class Student_class implements Serializable {
	
	int roll ;
	String name;
	int marks;
	
	public Student_class() {
		// TODO Auto-generated constructor stub
	}

	public Student_class(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
