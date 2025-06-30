package methods;

public class Students {

		
		int sid;
		String sname;
		char grade;
		
		void printStudentData() 
		{
			System.out.println(sid+" "+sname+" "+ grade);
			
		}
		
		void setStudentData(int id, String name, char gr)
		{
			sid = id;
			sname=name;
			grade=gr;

		}		
		
		Students(int id, String name, char gr)
		{
			sid = id;
			sname=name;
			grade=gr;

		}
		
}


