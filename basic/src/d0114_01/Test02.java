package d0114_01;

import java.io.FileReader;

public class Test02 {
	
	
	public void f1() throws MyException{
		try {
			f2();
		}catch(NullPointerException e) {
			System.out.println("f1() catch...");
			throw new MyException(e.getMessage());
		}
	}
	
	public void f2() throws NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException{
		String s = null;
		int n = s.length();
		int i = 4/0;
		int[] arr = new int[3];
		System.out.println(arr[3]);
//		FileReader fr = new FileReader("a.txt");
		
	}
	
	public static void main(String[] args) {
		
		Test02 t = new Test02();
		
			try {
				t.f1();
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			

		
		System.out.println("end");
	}
}
