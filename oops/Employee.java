package oops;

public class Employee {
	
	int eid;
	String ename;
	String job;
	int salary;

	// Method
	
	void display()
	
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(salary);
	}
	
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.eid=12345;
		emp.ename="John";
		emp.job = "sales";
		emp.salary= 25500;
		emp.display();
		
		Employee emp1 = new Employee();
		
		emp1.eid=102;
		emp1.ename="Poonam";
		emp1.job = "Manager";
		emp1.salary= 50000;
		emp1.display();
		
		Employee emp2 = new Employee();
		emp.eid=103;
		emp.ename="Prasad";
		emp.job = "QA Lead";
		emp.salary= 35000;
		emp.display();
		
		
		
		
	}

}
