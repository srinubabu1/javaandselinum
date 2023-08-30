package inherDemo;

public class TestB extends TestA
{
	int a=20;

	public static void main(String[] args) 
	{
		TestA t1 = new TestB();
		System.out.println(t1.a);

	}

}
