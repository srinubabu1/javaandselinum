package srinu;

public class Methoddemo7A {

	public static void main(String[] args) {
		Methoddemo7A m1=new Methoddemo7A();
		m1.funb();//funa calling as m1.funa();
		Methoddemo7A m2=new Methoddemo7A();
		m2.funb();//funa calling as m2.funa();
	}
	void funa()
	{
		System.out.println("funa of methoddemo7a");
	}
	void funb()
	{
		System.out.println("funb of methoddemo7a");
		funa();//calling from funb current object
       this.funa();
	}

}
