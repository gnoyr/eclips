package basic;

public class ex_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//중첩반복문
		for(int k = 0; k < 3 ; k++) {
			System.out.println("바깥쪽 반복문 실행 ...");
			for(int m = 0; m < 5; m++) {
				System.out.println("\t안쪽 반복문 실행...");
				
			}
			
		}
		
	}

}
