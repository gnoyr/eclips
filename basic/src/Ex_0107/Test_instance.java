package Ex_0107;

class A{
	static int n; //static 변수 = 정적 변수
	char c; //멤버변수 = 필드 = 인스턴스 변수
	
	//멤버함수 추가 f함수 함수가 호출되면 무조건 캐릭터 c에 z가 들어감.
	//student 클래스 만들고 번호 이름 성별 만들기 / cnt 변수 정적변수 만들기 초기화 0으로 세팅/ 다섯명의 학생 만들기 / cnt =>현재 까지 저장된 학생이 몇명인지
	void f() {
		
		c = 'z';
		
	}
	
}


public class Test_instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A(); //a->참조변수 인스턴스 변수는 참조 변수가 있어야함.
		A b = new A();
		A c = new A();
		
//		a.c = 'A';
//		b.c = 'B';
//		c.c = 'C';
//		
//		System.out.println(a.c);
//		System.out.println(b.c);
//		System.out.println(c.c);
//		
//		System.out.println(a.n);
//		System.out.println(b.n);
//		System.out.println(c.n);
		
		a.f();
		System.out.println(a.c);
		
	}

}
