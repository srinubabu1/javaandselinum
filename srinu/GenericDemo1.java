package srinu;

public class GenericDemo1<T> 
{
   T t1;
	public static void main(String[] args) 
	{
		GenericDemo1 g1 = new GenericDemo1();
		g1.funA(10);
		g1.funA(true);
		g1.funA(new A());
		g1.funA("RBG Technology");
	}
	void funA(T t1)
	{
		System.out.println(t1);

	}

}
