package srinu;

public class TestD 
{
	   TestD (int a)
		{
			System.out.println("cons of TestD");
		}

    public  static void main (String[]args)
    {
    	TestD t1 = new TestD(10);
    	System.out.println("done");
    }
}