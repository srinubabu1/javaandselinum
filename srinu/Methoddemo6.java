package srinu;

public class Methoddemo6 {

	public static void main(String[] args) {
		System.out.println("main method start");
		funb();
		System.out.println("done");
	}
	void funa()
	{
		System.out.println("funa of methoddemo6");
	}
	static void funb()
	{
		System.out.println("funb of methoddemo6");
		Methoddemo6 m1 = new Methoddemo6();
		m1.funa();
	}

	}


