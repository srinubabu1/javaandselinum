package srinu;

public class TestA 
{
	TestA()
	{
		System.out.println("cons of TestA");
	}

//	public class TestA extends TestB
//	{
//		TestB(int a)
//		{
//			System.out.println("cons of testb");
//			System.out.println(a);
//		}
	
   public static void main(String[] args)
   {
	   TestB t1 = new TestB(10);
	   System.out.println("done");
   }
   }
