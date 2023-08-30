package srinu;

public class ThisDemo5A 
{
	int a=5;
	ThisDemo5A()
	{
		System.out.println("zero args of ThisDemo5A");
		a=10;
	}
	ThisDemo5A(int a)
	{
		this();
		System.out.println("int args of ThisDemo5A");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method start");
		ThisDemo5A t1 = new ThisDemo5A(20);
		System.out.println("done");

	}

}
