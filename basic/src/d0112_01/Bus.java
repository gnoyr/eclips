package d0112_01;

public class Bus extends Vehicle{

	@Override
	public void go() {
		money = 2000;
		System.out.println("버스탑승 "+money+"원");
	}
}
