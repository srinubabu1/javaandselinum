
public class MethodDemo7 
{
	public static void main(String[] args) 
	{
	System.out.println("main method of methodDemo7");
	
	//m1.funB();
	MethodDemo7 k= new MethodDemo7();
	k.funB();
	System.out.println("Done");
	}
	void funA()
	{
		System.out.println("funA of MethodDemo7");
	}
	void funB()
	{
		System.out.println("funB of MethodDemo7");
		MethodDemo7 m1 = new MethodDemo7();
		m1.funA();
		
	}
	}
	

