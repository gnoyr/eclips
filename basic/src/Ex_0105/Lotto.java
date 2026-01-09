package Ex_0105;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rdnum = 0;
		int[] A = new int[6];
		int x = 0;
		int y = x + 1;
		Random rd = new Random();
		
		
		//배열 만들기 6인덱스로 int[]A = new int[6];
		//배열에 랜덤값을 넣는다 for(int i=0;i<6;i++){A[i]=rdnum};
		//이전 배열 중에서 중복되는 값이 있는지 확인한다.
		//이전 배열

		
		
		//중복된다면 다음값을 중복되지않는 값으로 변경한다.
		//5번 반복한다.
		
		
		for(int i = 0; i < 6; i++) {
			System.out.println(A[i]);
		}
	}
}