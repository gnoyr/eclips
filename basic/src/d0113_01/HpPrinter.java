package d0113_01;

public class HpPrinter implements Printable{
	
	@Override
	public void printing() {
		System.out.println("hp " + "인쇄");
	}
	
	@Override
	public void scan() {
		System.out.println("hp " + "스캔");
	}
	
	@Override
	public void copy() {
		System.out.println("hp " + "복사");
	}
	
	@Override
	public void fax() {
		System.out.println("hp " + "팩스");
	}
	
	@Override
	public void  showEndMSG() {
		System.out.println("hp 끝");
	}
}
