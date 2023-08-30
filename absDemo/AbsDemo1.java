package absDemo;

public abstract class AbsDemo1 
{
	AbsDemo1()
	{
		System.out.println("cons of AbsDemo1");
	}
	  abstract void funA();//funa and funb unimplemented functions
	  abstract void funB();
	  
	  void funC()     //implemented functions
	  {
		  System.out.println("funC of AbsDemo1");
	  }
	
	
	public static void main(String[] args) 
	{
		//AbsDemo1 ab1 = new AbsDemo1();
		//ab1.funC();

	}

}
