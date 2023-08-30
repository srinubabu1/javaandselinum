package inherDemo;

public class TestD extends TestC 
{

	public static void main(String[] args) 
	{
		TestC t1 = new TestD();
		t1.funA();
	}
	static void funA()
	{
		System.out.println("funA of TestD");

	}

}
