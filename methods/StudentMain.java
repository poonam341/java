package methods;

public class StudentMain {

	public static void main(String[] args) {

		/*Students stu=new Students();
		
		// 1) using object reference variables
		
		stu.sid=1234;
		stu.sname="Poonam";
		stu.grade='A';
		
		stu.printStudentData();
		
		// 2) using method
		
		stu.setStudentData(110,"ABCD" , 'B');
		stu.printStudentData();
		*/
		
		//3 ) Using Constructor
		
		Students stu=new Students(110,"David" , 'B');
		stu.printStudentData();
	
	}

}
