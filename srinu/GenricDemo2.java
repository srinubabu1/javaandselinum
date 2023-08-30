package srinu;

public class GenricDemo2<T> 
{
   T t1;
	public static void main(String[] args) 
	{
		GenricDemo2<String> g1 = new GenricDemo2<String>();
		g1.funA("RBG Technology");
		///g1.funA(10);
		//g1.funA(true);
		GenricDemo2<A> g2 = new GenricDemo2<A>();
		g2.funA(new A());
		GenricDemo2<Integer> g3 = new GenricDemo2<Integer>();
		g3.funA(10);
		//GenricDemo2<boolean> g3 = new GenricDemo2<boolean>();
		GenricDemo2<Boolean> g4 = new GenricDemo2<Boolean>();
		g4.funA(true);
	}
	void funA(T t1)
	{
		System.out.println(t1);

	}

}
