package srinu;

public class ConsDemo8 
{
	int i =5;
	ConsDemo8(int a)
	{
		i=a;
	}

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		ConsDemo8 c1 = new ConsDemo8(10);
		System.out.println(c1.i);
		
		ConsDemo8 c2 = new ConsDemo8(20);
		System.out.println(c2.i);
		 
		System.out.println("done");

	}

}
