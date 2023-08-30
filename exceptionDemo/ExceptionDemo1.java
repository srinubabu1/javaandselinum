package exceptionDemo;

public class ExceptionDemo1 
{
	static A k;

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		
       try
       {
    	 System.out.println(10/2);
    	 
    	 int arr[] = {10,20,30,40};
    	 System.out.println(arr[3]);
    	 System.out.println(k.a);
       }
       catch(ArithmeticException a1)
       {
    	   System.out.println("ArthmaticException block is invoking");
       }
       catch(ArrayIndexOutOfBoundsException a1)
       {
    	   System.out.println("ArrayIndexOutOfBoundsException block is invoking");
       }
       catch(NullPointerException a1)
       {
    	   System.out.println("NullPointerException block is invoking ");
       }
       System.out.println("done");
	}
	

}
