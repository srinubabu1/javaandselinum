package srinu;

public class Methoddemo4 {

	public static void main(String[] args) {
		System.out.println("main method start");
		funC();
		System.out.println("done");
	}
	static void funA()
	{
		System.out.println("funa of methoddemo4");
	funC();
	}
	static void funB()
	{
		System.out.println("funbof methoddemo4");
	funA();
	}
	static void funC()
	{
		System.out.println("func of methoddemo4");
		funB();
	}
}
	


