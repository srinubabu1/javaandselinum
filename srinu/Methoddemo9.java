package srinu;

public class Methoddemo9 {

	public static void main(String[] args) {
		System.out.println("main method of methoddemo9");
		Methoddemo9 m1 = new Methoddemo9();
		m1.funa();
		m1.funb();
		System.out.println("done");
	}
	void funa()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	int funb()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return 3000;
	}
}


