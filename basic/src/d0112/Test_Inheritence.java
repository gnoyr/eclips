package d0112;

public class Test_Inheritence{

	public static void main(String[] args) {
//		A a = new A();
//		a.n = 10;
//		a.f();
//		
//		B b = new B();
//		b.s = "hello";
//		b.f1();
//		
//		b.f();
		
//		B b = new B();
//		
//		A a = new A();

		A[] aa = new A[2];
		aa[0] = new B();
//		
//		B x = (B)ab;
		
		aa[1] = new C();
		
	}
	
	
}

class A{
	protected int n;
	
	A(){
		System.out.println("A 클래스 인스턴스 생성...");
	}
	
	void f() {
		System.out.println("f() 함수 실행..." + n);

	}
}

class B extends A{
	String s;
	
	B(){
		System.out.println("B 클래스 인스턴스 생성...");
	}
	
	void f1() {
		System.out.println("f1() 함수 실행" + s + n);
	}
}

class C extends A{
	float f;
	
	void f2() {
		System.out.println("f2()함수 실행..."+f);
	}
}