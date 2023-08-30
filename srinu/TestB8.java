package srinu;

public class TestB8 
{
	int id;
	String name;
	
	void display()
	{
		System.out.println(id+""+name);
	}

	public static void main(String[] args) 
	{
		TestB8 s1 = new TestB8();
		TestB8 s2 = new TestB8();
		s1.display();
		s2.display();

	}

}
