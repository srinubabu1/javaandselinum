package srinu;

public class PolyDemo4 {

	public static void main(String[] args) 
	{
		PolyDemo4 p1 = new PolyDemo4();
		p1.funA();
		A k = new A();
		p1.funA(k);
	}
void funA()
{
	System.out.println("zero args of PolyDemo4");
}
void funA(A a1)
{
	System.out.println("class A args of PolyDemo4");
	System.out.println(a1);
}
void funA(B a1)
{
	System.out.println("class B args of PolyDemo4");
	System.out.println(a1);
}
void funA(C a1)
{
	System.out.println("class C args of PolyDemo4");
	System.out.println(a1);
}
}





