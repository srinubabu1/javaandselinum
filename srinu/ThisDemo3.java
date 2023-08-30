package srinu;

public class ThisDemo3 {

	public static void main(String[] args) {
		ThisDemo3 k = new ThisDemo3();
		k.funB();
		System.out.println(k);
		
		ThisDemo3 k2 = new ThisDemo3();
		k2.funB();
		System.out.println(k2);
	}
	void funB()
	{
		System.out.println(this);

	}

}
