package d0112_01;

public class Full extends WorkInfo implements Workable{

	public Full(int no) {
		super(no);
		System.out.println("j" + no);
	}

	@Override
	public void deposit() {
		pay = 200000 * 0.1;
		System.out.println("보너스: " + pay);
	}

}
