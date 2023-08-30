package srinu;

public class Methoddemo5 {

	public static void main(String[] args) {
		System.out.println("main method of methoddemo5");
		Methoddemo5 m1 = new Methoddemo5();
		m1.funb();
		System.out.println("done");
	}
	static void funa()
	{
		System.out.println("funa of methoddemo5");
	}
	void funb()
	{
		System.out.println("funb of methoddemo5");
		funa();
	}
}
	


