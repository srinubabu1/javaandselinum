package pack2;

import pack1.ProtectDemo1;

public class ProtecteChild extends ProtectDemo1
{

	public static void main(String[] args) 
	{
		ProtecteChild p1 = new ProtecteChild();
		System.out.println(p1.a);
          p1.funA();
	}

}
