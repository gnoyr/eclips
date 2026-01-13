package d0113_01;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		PrintFactory f = new PrintFactory("hp");
//		Printable user01 = f.getName();
//		
//		user01.printing();
//		user01.scan();
//		user01.copy();
//		user01.fax();
//		user01.showEndMSG();
		
		MultiFuctionPrinter pt = new MultiFuctionPrinter();
		
		pt.printing();
		pt.copy();
		pt.scan();
		
		
	}

}
