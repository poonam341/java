package oops;

public class EncapsulationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation bank=new Encapsulation();
		 /*bank.accno=1001;
		 bank.Accname="Poonam";
		 bank.balance=1023.01;
		 System.out.println(bank);*/
		 
		 bank.setAccno(101);
		 bank.setAccname("Poonam");
		 bank.setBalance(120345.23);
		 
		 System.out.println(bank.getAccno());
		 System.out.println(bank.getAccname());
		 System.out.println(bank.getBalance());
	}

}
