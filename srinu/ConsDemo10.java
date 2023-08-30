package srinu;

public class ConsDemo10 
{
	int i=5;
	int j=10;
	ConsDemo10(int i, int j)
	{
		i=i;
	     j=j;
	}
	public static void main(String[] args) 
	{
		System.out.println("main method start");
		ConsDemo10 c1= new ConsDemo10(20,30);
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println("done");

	}

}
