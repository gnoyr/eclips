package d0112_01;
	
class A1{
	int n;
	
	A1(int n){
		this.n = n;
	}
}	
	
	
class B1 extends A1{
	String s;
	
	B1(int n, String s){
		super(n); //super는 항상 최상단에 있어야함.
//		this.n = n;
		this.s = s;
	}
	
}


public class Test {
	
}
