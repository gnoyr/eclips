package Ex_0108;
//사칙연산 각각의 함수(static 함수)/실행 클래스 생성 ui담당 출력 사용자 입력/claculator라는 class 생성 사칙연산하는 클래스, 메서드
public class Calculator {
	int x;
	int y;
	
	String oper;
	
	Calculator(){
		}
	
	static int add(int x, int y) { //유틸리티 클래스
		return x + y;
	}
	
	static void sub(int x, int y) {
		int result;
		result = x - y;
		System.out.println(result);
	}
	
	static void mul(int x, int y) {
		int result;
		result = x * y;
		System.out.println(result);
	}
	
	static void div(int x, int y) {
		int result;
		result = x / y;
		System.out.println(result);		
	}
	
}
