package d0115;

public class InfinityArrayAddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfinityArrayAdd<String> arr = new InfinityArrayAdd<>();
		
		arr.add(0, "ABC");
		arr.add(1, "BCA");
		arr.add(2, "CBA");
		arr.add(3, "ACB");
		arr.add(4, "BAC");
		
		arr.showArr();

		arr.add(1, "abc");
		arr.add("cfd");
		
		System.out.println("-----------------");
		arr.showArr();
		System.out.println("-----------------");
//		Object s = arr.get(0);
		
		
	}

}
