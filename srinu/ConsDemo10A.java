package srinu;

public class ConsDemo10A 
{
		int i=5;
		int j=10;
		
		ConsDemo10A(int i, int j)
		{
		this.i=i;
		 this.j=j;
		}
		public static void main(String[] args) 
		{
			System.out.println("main method start");
			ConsDemo10A c1= new ConsDemo10A(20,30);
			System.out.println(c1.i);
			System.out.println(c1.j);
			System.out.println("done");
		}
	}


