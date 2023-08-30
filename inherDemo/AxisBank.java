package inherDemo;

public class AxisBank extends RBIBank
{
	AxisBank()
	{
		System.out.println("cons of AxisBank ");
	}
	public static void main(String[] args) 
	{
		AxisBank ax1 = new AxisBank();
		ax1.cBillscore();
		ax1.personalLoan();
	}
   void personalLoan()
   {
	   System.out.println("personalLoan of AxisBank");
	}

}
