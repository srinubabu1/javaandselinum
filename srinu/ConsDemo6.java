package srinu;

public class ConsDemo6 
{
	int i =10;
	ConsDemo6()
	{
		int a= 15;
		i=a;
	}

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		ConsDemo6 c1 = new ConsDemo6();
		System.out.println(c1.i);
		System.out.println("done");

	}

}
