package Ex_0108;

public class TransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus100 = new Bus("100");
		Student stu01 = new Student("James", 1, 10000);
		
		System.out.println(bus100.toString());
		System.out.println(stu01.toString());
		
		bus100.take(1000);
		System.out.println(bus100.toString());
		System.out.println(stu01.toString());
	}
}
