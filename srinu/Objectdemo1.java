package srinu;

public class Objectdemo1 {
	int a=10;
	boolean b=true;
	static int c=20;
	public static void main(String[] args) {
		System.out.println(c);
		new Objectdemo1();
		int i =10;
		Objectdemo1 d1 =new Objectdemo1();
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1);
	}

}
