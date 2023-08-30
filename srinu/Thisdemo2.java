package srinu;

public class Thisdemo2 
{
	Thisdemo2()
	{
		System.out.println(this);
	}

	public static void main(String[] args) 
	{
		Thisdemo2 t1 = new Thisdemo2();
		System.out.println(t1);
		
		Thisdemo2 t2 = new Thisdemo2();
				System.out.println(t2);
		
		Thisdemo2 t3 = new Thisdemo2();
				System.out.println(t3);

	}

}
