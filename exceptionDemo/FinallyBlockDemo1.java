package exceptionDemo;

public class FinallyBlockDemo1 
{
	static int a=10;
	static int b=0;

	public static void main(String[] args) 
	{
		try
		{
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("catch block is invoking");
		}
      try
      {
    	System.out.println(a/b);
      }
      catch(Exception e)
      {
    	  System.out.println("catch block is invoking");
      }
      finally
      {
    	  System.out.println("finally block is invoking");
      }
	try
	{
		System.out.println(a/b);
	}
  finally
  {
	  System.out.println("finally block is invoking");
  }
  System.out.println("done");
	}
}
