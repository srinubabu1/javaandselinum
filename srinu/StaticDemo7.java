package srinu;

public class StaticDemo7 
{
	//int a =10;
	//static int b=20;
	int a = funA();
	static int b = funB();

	public static void main(String[] args) 
	{
	System.out.println("main method starts");
	StaticDemo7 s1 = new StaticDemo7();
	s1.funA();
	System.out.println(s1.a);
	System.out.println("done");
	
	
	
	}
	int funA()
	{
		System.out.println("funA of StaticDemo7");
		return 10;
	}
	static int funB()
	{
		System.out.println("funB of StaticDemo7");
		return 20;
	}

	}

