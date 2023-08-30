package srinu;

public class WrapperClassDemo3 {

	public static void main(String[] args) 
	{
		int creditcardBalance = 5000;
		String ticketcharges ="4000";
		int charge = Integer.parseInt(ticketcharges);
		//if(creditcardBalance>= ticketcharges)
		if(creditcardBalance >= charge)
		{
			System.out.println("book the ticket");
		}
		else
		{
			System.out.println("insufficient funds");
		}
	}

}
