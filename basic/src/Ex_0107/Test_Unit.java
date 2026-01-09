package Ex_0107;

public class Test_Unit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Unit red = new Unit("red");
		 
		 Unit blue = new Unit("blue");
		 
		 System.out.println(red.getName() + " " + red.getEnergy());
		 System.out.println(blue.getName() + " " + blue.getEnergy());
		 
		 red.attack(blue);
		 System.out.println(red.getName() + " " + red.getEnergy());
		 System.out.println(blue.getName() + " " + blue.getEnergy());
	}
}