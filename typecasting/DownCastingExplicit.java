package typecasting;

public class DownCastingExplicit {

	public static void main(String[] args) {

		// downcasting-----converting value from  larger----> smaller ( We need to do manually )
		
				// example ---1 
				long longvalue1=2000135;
				int value1=(int)longvalue1;
				System.out.println(value1);
				
				
				// example --2
				double value2=120.3;
				float fvalue2=(float)value2;
				System.out.println(fvalue2);
				
				// example --3 Downcasting  
				
				double d1=100.23;
				int ivalue=(int)d1;
				System.out.println(ivalue);

	}

}
