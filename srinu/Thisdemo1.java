package srinu;

public class Thisdemo1 
{
	Thisdemo1()
	{
		System.out.println(this);
	}

	public static void main(String[] args) 
	{
		Thisdemo1 t1 = new Thisdemo1();
		System.out.println(t1);

	}

}
