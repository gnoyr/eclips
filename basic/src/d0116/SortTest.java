package d0116;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = {1, 5, 2, 3, 4};
		
		Arrays.sort(ar1);
		
		for(int n : ar1) {
			System.out.println(n + "\t");
		}
	}

}
