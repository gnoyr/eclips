package Ex_0105;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr = new int[4][5];
		int i = 1;
		boolean flag = true;
		
		for(int a = 0;a < 4; a++) {
			for(int b = 0; b<5; b++) {
				if(flag) {
					arr[a][b] = i++;
					flag = false;
				}else {
					arr[a][b] = i++;
					flag = true;
				}
			}
		}
		
		System.out.println(arr[1][4]);
	}

}
