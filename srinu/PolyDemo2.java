package srinu;

public class PolyDemo2 {

	public static void main(String[] args) 
	{
		PolyDemo2 p1 = new PolyDemo2();
		p1.funA();
		p1.funA(10);
		p1.funA(10.23);
		p1.funA(10.23f);
	}
   void funA()
   {
	   System.out.println("zero args of PolyDemo2");
   }
   void funA(int a)
   {
	   System.out.println("int args funA of PolyDemo2");
	   System.out.println(a);
   }
   void funA(long a)
   {
	   System.out.println("long args funA of PolyDemo2");
	   System.out.println(a);
   }
   void funA(float a)
   {
	   System.out.println("float args funA of PolyDemo2");
	   System.out.println(a);
   }
   void funA (double a)
   {
	   System.out.println("double args funA of PolyDemo2");
	   System.out.println(a);
   }
}
