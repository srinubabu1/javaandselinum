package srinu;

public class Odemo10a 
{
	A getA (int x)
	{
	A a1 = new A();
	a1.i = x;
	a1.j = x+1;
	return a1;
	}
	public static void main(String[] args) 
	{
	Odemo10a d1 = new Odemo10a();
	System.out.println(10);
	System.out.println(10);
    System.out.println(d1.getA(4));
    System.out.println(d1.getA(4));
	int a =10;
	System.out.println(a);
	System.out.println(a);
	A k = d1.getA(4);
	System.out.println(k);
	System.out.println(k);
	}

}
