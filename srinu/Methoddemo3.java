package srinu;

public class Methoddemo3 {

	public static void main(String[] args) {
		System.out.println("main method of methoddemo3");
		funb();
		System.out.println("done");
	}
static void funa()
{
	System.out.println("funa of methoddemo3");
}
static void funb()
{
	System.out.println("funb of methoddemo3");
	funa();
}
}


