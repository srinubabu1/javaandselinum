package srinu;

public class StaticDemo6 
{

	public static void main(String[] args) 
	{
		StaticDemo5 s1 = new StaticDemo5();
		System.out.println(s1);
		StaticDemo5 s2 = new StaticDemo5();
		System.out.println(s2);
		s1.a1.funA();
		StaticDemo5.a1.funA();
	}

}
