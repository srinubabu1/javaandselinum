package srinu;

public class MethodOverLoad1 
{
	int i=10;

	public static void main(String[] args) 
	{
		MethodOverLoad1 m1 = new MethodOverLoad1();
		m1.funA(10);
	}
	void funA()
	{
		System.out.println("zero of args");
	}
	int   funB()
	{
		System.out.println("int args");
		System.out.println(i);
		return i;
	}
	void funA(long l)
	{
		System.out.println("long args");
		System.out.println(l);
	}
}
