package d0113;

public class LTv implements Tvable{
	
	@Override
	public void powerOn() {
		System.out.println("엘지" + "엘지전원on");
	}
	
	@Override
	public void powerOff() {
		System.out.println("엘지" + "엘지전원off");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("엘지" + "엘지볼륨up");
	}
	
	@Override
	public void volumeDawn() {
		System.out.println("엘지" + "엘지볼륨dawn");
	}
}
