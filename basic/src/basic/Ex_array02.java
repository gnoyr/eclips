package Ex_0105;

public class Ex_Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]A = {1,3,5,7,9};
		int[]B = {2,4,6,8,10};
		int[]C = new int[10];
		int xA = 0;
		int xB = 0;
		for(int i = 0; i < 10; i++) {
			
			if(i%2==0) {
				C[i]=A[xA];
				xA++;
			}else {
				C[i]=B[xB];
				xB++;
			}
		}
//		for(int cnt = 0; cnt<10; cnt++) {
//			System.out.println(C[cnt]);
//		}
		

		
		for(int i = 0; i < 10; i++) {
			
			System.out.print(C[i]+",");
			
		}System.out.println(C[9]);
	}

}