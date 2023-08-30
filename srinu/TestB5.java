package srinu;

public class TestB5 
{
	static int rbg=1;
	TestB5()
	{
		System.out.println("cons of testb5 is invoking");;
		rbg=rbg+1;
	}

	public static void main(String[] args) 
	{
		System.out.println(rbg);
		new TestB5 ();
		new TestB5 ();
		new TestB5 ();
		System.out.println("rbg");

	}

}
