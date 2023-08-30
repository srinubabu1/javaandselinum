package inherDemo;

public class CanaraBank extends RBIBank
{
	CanaraBank ()
	{
		System.out.println("cons of CanaraBank ");
	}
	public static void main(String[] args) 
	{
		CanaraBank  c1 = new CanaraBank ();
		c1.cBillscore();
		c1.cropLoan();
		RBIBank r1 = new CanaraBank ();
		r1.cBillscore();
		//r1.cropLoan();
	}
      void cropLoan()
      {
    	  System.out.println("croploan of CanaraBank ");
      }
}
