package d0116;

import java.util.Arrays;

public class MySystemArrayCopy{
	
	static <T> void myArrayCopy(T[] arraya, int arrayaidx, T[] arrayb, int arraybidx, int arrayblength) {
		for(int i = arrayaidx, m = 0; i < arrayblength; i++, m++) {
			arrayb[m] = arraya[i];
		}
//		T[] arrb = Arrays.copyOfRange(arrayb, arraybidx, arrayb.length);
//		T[] arra = Arrays.copyOf(arraya, arraya.length);
//		arrb[0] = arra[0]; 
	}

}
