package d0114_01;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//uncheckedExeption
//		try {
//			int n = 4/0;			
//			int[] arr = new int[3];
//			System.out.println(arr[3]);
//			Student s = null;
//			s.getClass();

//		}catch(ArrayIndexOutOfBoundsException e) {
//			
//		}catch(NullPointerException e) {
//			System.out.println("null catch");
//		}catch(ArithmeticException e) {
//			
//		}catch(Exception e) {
//			
//		}

		//checkedExeption
//		try {
//			FileReader fr = new FileReader("a.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		

		
		
	}
	
	public void f1() {
		f2();
	}
	
	public void f2() {
		String s = null;
		int n = s.length();
	}
	
	public static void main1(String[] args) {
		
		f1();
		
		
		
		System.out.println("end");
	}
}
