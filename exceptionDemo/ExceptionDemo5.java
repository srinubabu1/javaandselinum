package exceptionDemo;

public class ExceptionDemo5 
{
	static A k;
	public static void main(String[] args) 
	{
		System.out.println("main method start");

		try
		{
			System.out.println(10/2);
			int arr[]={10,20,30,40};
			System.out.println(arr[3]);
			System.out.println(k.a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("arthmaticException block is invoking");
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("ArrayIndexOutOfBoundsException block is invoking");
		}
		catch(NullPointerException a1)
		{
			System.out.println("NullPointerException block is invoking ");
		}
		catch(Exception a1)
		{
			System.out.println("exception block is invoking");
			System.out.println(a1);
		}
		catch(Throwable a1)
		{
			System.out.println("Throwable block is invoking");
			System.out.println(a1);
		}
		System.out.println("done");
	}
}



