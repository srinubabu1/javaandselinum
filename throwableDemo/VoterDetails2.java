package throwableDemo;

public class VoterDetails2 
{

	public static void votervalidation(int age) 
	{
		
		if(age>=18)
		{
			System.out.println("valid voter");
		}
		else
		{
			System.out.println("age is below 18 and not valid");
			//throw new VoterAgeException();
		}
		System.out.println("continue");
        System.out.println("done");
	}

}
