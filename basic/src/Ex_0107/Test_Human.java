package Ex_0107;

public class Test_Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hu01 = new Human();
		hu01.setname("탁윤기");
		hu01.setgender('M');
		hu01.setage(50);
		
		Human hu02 = new Human();
		hu02.setname("표연자");
		hu02.setgender('F');
		hu02.setage(80);
		
		System.out.println(hu01.getname() + " " + hu01.getgender() + " " + hu01.getage());
		System.out.println(hu02.getname() + " " + hu02.getgender() + " " + hu02.getage());
		
//		hu01.bad("술");
		hu01.ciga(5);
		hu02.drink(10);
		System.out.println(hu01.getname() + " " + hu01.getgender() + " " + hu01.getage());
		System.out.println(hu02.getname() + " " + hu02.getgender() + " " + hu02.getage());
		
	}
}
