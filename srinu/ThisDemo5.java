package srinu;

public class ThisDemo5 
{
	ThisDemo5()
	{
		System.out.println("zero args of ThisDemo5");
	}
	ThisDemo5(int a)
	{
		this();
		System.out.println("int args of ThisDemo5");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method start");
		ThisDemo5 t1 = new ThisDemo5(10);
		System.out.println("done");

	}

}
