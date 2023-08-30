package srinu;

public class Methoddemo7 {
	
     public static void main(String[]args)
     {
    System.out.println("main method of methoddemo7");
    //m1.funb();
    Methoddemo7 k = new Methoddemo7();
    k.funb();
    System.out.println("done");
     }
     void funa()
     {
    	 System.out.println("funa of methoddemo7");
     }
     void funb()
     {
    	 System.out.println("funb of methoddemo7");
    	 Methoddemo7 m1=new Methoddemo7();
    	 m1.funa();
     }
     }
     

