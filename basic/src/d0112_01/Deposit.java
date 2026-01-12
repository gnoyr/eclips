package d0112_01;

public class Deposit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Full full01 = new Full(1);
		Non non01 = new Non(1);
		
		Workable[] wka = new Workable[3];
		wka[0] = full01;
		wka[1] = non01;
		
		wka[0].deposit();
		
	}

}
