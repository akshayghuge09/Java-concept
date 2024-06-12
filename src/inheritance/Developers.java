package inheritance;

public class Developers extends Employee {

	String skillset;

	public Developers() {
		// TODO Auto-generated constructor stub
	}

	public Developers(int id, String name, int salary, String skillset) {

		// refers to structure of super class
		super(id, name, salary);
		this.skillset = skillset;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSkillset() {
		return skillset;
	}

	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}

//method signature in parent class & in derives class
//access specifier + return type+function name +parameter list
//method overriding gives flexibility
	
	
	public void calSalary() {
		System.out.println("From Developer");
		System.out.println(this.salary);

	}
}
