package inherDemo;

public class ToStringDemo1 
{
	int a=10;
	String s1 ="RBG Technologies";

	public static void main(String[] args) 
	{
		System.out.println("main method of ToStringDemo1");
		ToStringDemo1 t1 = new ToStringDemo1();
		System.out.println(t1);
		System.out.println("done");
	}
	public String tostring()
	{
		System.out.println("tostring of ToStringDemo1");
		return s1+"  "+a;		

	}

}
