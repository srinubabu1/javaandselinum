package srinu;

public class PolyDemo1 {

	public static void main(String[] args) 
	{
		PolyDemo1 p1 = new PolyDemo1();
		p1.funA();
		p1.funA(10);
		p1.funA(true);
	}
	void funA()
	{
		System.out.println("zero args of PolyDemo1");
	}
	void funA(int a)
	{
		System.out.println("int args of PolyDemo1");
		System.out.println(a);
	}
	void funA(boolean a)
	{
		System.out.println("boolean args of PolyDemo1");
		System.out.println(a);
	}

	}


