package srinu;

public class CallByValue2 
{
int data = 50;
void change(int data)		
{
 data=data+100;
}
public static void main(String[] args) 
{
	CallByValue2 op = new CallByValue2();
	System.out.println("before change"+op.data);
	op.change(500);
	System.out.println("after chnage"+op.data);

}

}
