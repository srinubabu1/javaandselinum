package srinu;

public class ConsDemo7 
{
	ConsDemo7(int a)
	{
		System.out.println("cons of ConsDemo7");
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		//ConsDemo7 c1 = new ConsDemo7();
		ConsDemo7 c1 = new ConsDemo7(20);
		System.out.println("done");

	}

}
