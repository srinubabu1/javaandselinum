package srinu;

public class ConsDemo9 
{
	int i = 5;
	int j = 10;
	ConsDemo9 (int a,int b)
	{
		i=a;
		j=b;
	}

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		ConsDemo9  c1 = new ConsDemo9 (20,30);
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println("done");

	}

}
