package srinu;

public class Bududemo1 {

	public static void main(String[] args) {
		int grossalary = 10000;
		//int netsalary = grossalary_totalchrges
		Bududemo1 bd1 = new Bududemo1();
		int netsalary = grossalary-bd1.housecharges2();//10000-3000=7000
		System.out.println(netsalary);//7000
		int taxcal = 30* bd1.housecharges2();//30*3000=90000
		System.out.println(taxcal);//90000
	}
void housecharges()
{//void is non static
	int rent =1000;
	int childfee =2000;
	int totalcharges =rent + childfee;//
	System.out.println(totalcharges);
}
int housecharges2()
{
	System.out.println("housecharges2is invoking");
	int rent =1000;
	int childfee =2000;
	int totalcharges =rent + childfee;//1000+2000=3000
	System.out.println(totalcharges);//3000
	return totalcharges;
}
}
	


