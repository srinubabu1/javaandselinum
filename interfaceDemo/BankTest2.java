package interfaceDemo;

public class BankTest2 {

	public static void main(String[] args) 
	{
		Bank b1 = new USBank();
		b1.totalBalance();
		b1.totalcustomer();
		
		b1=new UKBank();
		b1.totalBalance();
		b1.totalcustomer();
		
		b1=new CanadaBank();
		b1.totalBalance();
		b1.totalcustomer();

	}

}
