package exceptionDemo;

public class ExceptionDemo3 
{
	static A k;

	public static void main(String[] args) 
	{
	  System.out.println("main method start");
	  try
	  {
		  System.out.println(10/2);
	  }
    catch(Exception a1)
	  {
    	System.out.println("exception block is invoking");
    	System.out.println(a1);
	  }
	  try
	  {
		  int arr[]={10,20,30,40};
		  System.out.println(arr[4]);
	  }
	  catch(Exception a1)
	  {
		  System.out.println("exception block is invoking");
	  }
	  try
	  {
		  System.out.println(k.a);
	  }
	  catch(Exception a1)	  
	  {
		 System.out.println("Exception block is invoking"); 
	  }
	  System.out.println("done");
	}
}
	