package Ex_0105;

import java.util.Random;

public class Dice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int rdnum = 0;
		int[]A = new int[6];
		
		
		//0~5
		for(int i = 0;i < 10; i++) {
			rdnum = rd.nextInt(6)+1;
			A[rdnum-1] = A[rdnum-1]+1;
		}
		for(int cnt = 0; cnt < 6; cnt++) {
			System.out.println(A[cnt]);
		}
	}
}