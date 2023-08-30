package interfaceDemo;

public class BankTest3 
{
	Bank b1;

	public static void main(String[] args) 
	{
		BankTest3 b1 = new BankTest3();
        b1.bankDetails("canada");
	}
	void bankDetails(String bankname)
	{
		if(bankname.equals("us"))
		{
			b1=new USBank();
		}
		else if(bankname.equals("uk"))
		{
			b1=new UKBank();
		}
		else if(bankname.equals("canadabank"))
		{ 
			b1=new CanadaBank();
		}
	
    b1.totalBalance();
    b1.totalcustomer();
}
}
