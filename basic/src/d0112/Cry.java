package d0112;

class Cat{
	public void crying() {
		System.out.println("야옹..");
	}
}

class Dog extends Cat{
	@Override
	public void crying() {
		System.out.println("멍멍..");
	}
}

class Tiger extends Cat{
	@Override
	public void crying() {
		System.out.println("어흥..");
	}
}

public class Cry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat[] A = new Cat[3];
		A[0] = new Cat();
		A[1] = new Dog();
		A[2] = new Tiger();
		
		for(int i = 0; i < A.length; i++) {
			A[i].crying();			
		}
	}
}