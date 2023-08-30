package srinu;

public class WrapperClassDemo1 {

	public static void main(String[] args) 
	{
		int a=10;
		Integer i1 = new Integer(a);
		System.out.println(i1);
		
		int b =i1.intValue();
		System.out.println(b);

	}

}
