package d0112_01;

public class Person extends God implements Flyable, Swimable{

	@Override
	public void fly() {
		System.out.println("사람이 하늘을 납니다.");
		
	}

	@Override
	public void swim() {
		System.out.println("사람이 헤엄을 칩니다.");
		
	}
	
}
