package d0113_01;

public class MultiFuctionPrinter implements Multifuctionable{
	
	void printing() {
		System.out.println("복합기 출력");
		
	}
	
	@Override
	public void scan() {
		System.out.println("복합기 스캔");
		
	}

	@Override
	public void copy() {
		System.out.println("복합기 복사");
		
	}
	
}
