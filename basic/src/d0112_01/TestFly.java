package d0112_01;

public class TestFly {

	public static void main(String[] args) {
		Bird bird = new Bird();
		Car car = new Car();
		Person person = new Person();
		
//		bird.fly();
//		car.fly();
//		person.fly();
		
		Flyable[] arr = new Flyable[3];
		arr[0] = bird;
		arr[1] = car;
		arr[2] = person;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].fly();
		}
		
	}

}
