package d0116;

import java.util.Objects;

import javax.print.attribute.standard.MediaSize.Other;

class A{
	String s;
	
	A(){
		s = "aaa";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) return true; // 1.반사성
		if (!(obj instanceof A)) return false; //2. 타입검사
		
		A a = (A)obj;
		
		//null-safe 비교
		if (s == null) {
			return Other.class == null;
		}
		
		return s.equals(a.s);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(s);
	}
}	
	
	
public class EqualsEx{
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1.equals(a2));
	}
}
