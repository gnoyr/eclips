package d0115;

public class FruitAndBoxGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2<Apple> aBox = new Box2<>();
		
		aBox.set(new Apple());
		
		Apple ap = aBox.get();
		
		System.out.println(ap);

		
		Box2<Orange> oBox = new Box2<>();
		
		oBox.set(new Orange());
		
		Orange or = oBox.get();
		
		System.out.println(or);
	
	}

}
