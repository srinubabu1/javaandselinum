package interfaceDemo;

public class BankTest1 {

	public static void main(String[] args) 
	{
		//Bank b1 = new Bank();
		Bank b1 =null;
		Bank b2 = new USBank();
		b2.totalBalance();
		b2.totalcustomer();

		Bank b3 = new UKBank();
		b3.totalBalance();
		b3.totalcustomer();

		Bank b4 = new CanadaBank();
		b4.totalBalance();
		b4.totalcustomer();

	}

}
