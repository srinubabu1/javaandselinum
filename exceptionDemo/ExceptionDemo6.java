package exceptionDemo;

public class ExceptionDemo6 
{
	static int a=10;
	static int b=0;

	public static void main(String[] args) 
	{
		Addnumbers();
		Subnumbers();
		Divnumbers();
		Mulnumbers();
	}
	public static void Addnumbers()
	{
		try
		{
			int c=a+b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		public static void Subnumbers()
		{
			try
			{
				int c=a+b;
				System.out.println(c);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
			public static void Divnumbers()
			{
				try
				{
					int c=a+b;
					System.out.println(c);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
				public static void Mulnumbers()
				{
					try
					{
						int c=a+b;
						System.out.println(c);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
}
					
			
		
	
