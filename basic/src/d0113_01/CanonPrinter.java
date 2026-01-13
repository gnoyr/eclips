package d0113_01;

public class CanonPrinter implements Printable{
	
	@Override
	public void printing() {
		System.out.println("캐논 " + "인쇄");
	}
	
	@Override
	public void scan() {
		System.out.println("캐논 " + "스캔");
	}
	
	@Override
	public void copy() {
		System.out.println("캐논 " + "복사");
	}
	
	@Override
	public void fax() {
		System.out.println("캐논 " + "팩스");
	}
}
