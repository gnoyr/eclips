package Ex_0105;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int cnt = 0;
		while(cnt < 5) {
			sum = sum + cnt;
			System.out.println(sum);
			cnt++; // cnt = cnt + 1;
			if(sum > 5) {
				break;
			}
		}
		System.out.println("sum : " + sum);
	}

}
