package srinu;

public class CallByValue1 
{
	int data = 50;
	void change(CallByValue1 op)
	{
     op.data = op.data+100;
	}
	public static void main(String[] args) 
	{
		CallByValue1 op = new CallByValue1();
		System.out.println("before change"+op.data);
		op.change(op);
		System.out.println("after chnage"+op.data);

	}

}
