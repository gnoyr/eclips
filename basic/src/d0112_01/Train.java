package d0112_01;

public class Train extends Vehicle{
	
	@Override
	public void go() {
		money = 1000;
		System.out.println("기차탑승 "+money+"원");
	}
}
