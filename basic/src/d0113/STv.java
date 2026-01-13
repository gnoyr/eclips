package d0113;

public class STv implements Tvable{

	@Override
	public void powerOn() {
		System.out.println("삼성" + "전원on");
	}
	
	@Override
	public void powerOff() {
		System.out.println("삼성" + "전원off");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("삼성" + "볼륨up");
	}
	
	@Override
	public void volumeDawn() {
		System.out.println("삼성" + "볼륨dawn");
	}
}
