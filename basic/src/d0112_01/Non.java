package d0112_01;

public class Non extends WorkInfo implements Workable{

	
	public Non(int no) {
		super(no);
		System.out.println("b" + no);

	}

	@Override
	public void deposit() {
		pay = 10320 * 90;
		System.out.println("급여: " + pay);
	}

}
