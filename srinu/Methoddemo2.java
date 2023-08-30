package srinu;

public class Methoddemo2 {

	public static void main(String[] args) {
		System.out.println("main method of 	Methoddemo2");
		func();
		Methoddemo2 m1 = new Methoddemo2();
		m1.Funa();
		m1.funb();
		System.out.println("done");
	}
	void Funa()
	{
		System.out.println("Funa of Methoddemo2");
	}

	void funb ()
	{
		System.out.println("Funb of Methoddemo2");
	}
	static void func()
	{
System.out.println("func of Methoddemo2");
	
	}
}
	


