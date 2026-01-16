package d0116;

import java.util.Arrays;

public class CopyArrayTest {
	static void printArray(Object[] cpy) {
		for(Object d : cpy) {
			System.out.print(d + "\t");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		Double[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);
		
//		for(double d : arCpy1) {
//			System.out.print(d + "\t");
//		}
		
		Double[] arCpy2 = Arrays.copyOf(arCpy1, 3);
//		for(double d : arCpy2) {
//			System.out.print(d + "\t");
//		}
		
		Double[] arCpy3 = Arrays.copyOfRange(arOrg, 1, 3);
//		for(double d : arCpy3) {
//			System.out.print(d + "\t");
//		}
		
		Double[] cpy = new Double[3];
//		System.arraycopy(arOrg, 0, cpy, 0, 3); //대입 연산자x
		
		MySystemArrayCopy.myArrayCopy(arOrg, 0, cpy, 0, 3);
		printArray(cpy);

	}

}
