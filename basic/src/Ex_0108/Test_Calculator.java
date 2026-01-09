package Ex_0108;

import java.util.Scanner;

public class Test_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
//		Calculator test01 = new Calculator(); 
//		test01.add(4, 5);		
		//사용자는 연산할 두개의 숫자와 연산자를 선택한다. /덧셈이면 add함수가 호출
		
		Calculator.add(x,y);
	}

}