package inheritance;

public class Tester extends Employee {
	
int no_bugs;
	
	public Tester() {
		// TODO Auto-generated constructor stub
	}

	public Tester(int id, String name, int salary,int no_hours) {
		super(id,name,salary);
		this.no_bugs = no_hours;
	}

	public int getNo_bugs() {
		return no_bugs;
	}

	public void setNo_hours(int no_bugs) {
		this.no_bugs = no_bugs;
	}
	public void calSalary()
	{
		System.out.println("Tester");
		System.out.println(this.salary+(this.no_bugs*100));
		
	}


}
