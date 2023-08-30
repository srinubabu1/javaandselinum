package throwableDemo;

import java.io.FileNotFoundException;
//import java.sql.SqlException;

public class VoterDetails 
{
     
	public static void votervalidation(int age) throws FileNotFoundException
	{
		votervalidation(19);
		votervalidation(17);
	}
	public static void votervadlidation(int age)  throws Exception
	{
		if(age>=19)
		{
			System.out.println("valid voter");
		}
		else
		{
			System.out.println("age is below 19 and not valid");
		}
		// throw new ArrayIndexOutBoundsException();
		//throw new ArithmeticException();
		//throw new NullPointerException();
		//throw new NumberFormatException();

		 //throw new FileNotFoundException();
		//throw new SqlException();
		//throw new Exception();
	
	System.out.println("continue");
	}
	
	}

	