package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeywordExcetionHnadle {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub
		
		System.out.println("Programme is started....");
		System.out.println("Programme is in progress....");
		
		Thread.sleep(5000);
		
		FileInputStream file=new FileInputStream("C:\\TEXT.txt");
		
		System.out.println("Programme is Finished....");
		System.out.println("Programme is exited....");
	}

}
