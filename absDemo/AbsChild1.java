package absDemo;

public  class AbsChild1 extends AbsDemo1
{
	AbsChild1()
	{
		System.out.println("cons of AbsChild1");
	}
	public static void main(String[] args) 
	{
		AbsChild1 ac1 = new AbsChild1();
		ac1.funC();

	}
	@Override
	void funA() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void funB() {
		// TODO Auto-generated method stub
		
	}

}
