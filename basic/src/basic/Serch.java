package Ex_0105;

public class Serch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int target = 2;
		int[]A = {-1, 2, 10, 34, 53, 57, 70, 77, 84};
		int end = 8;
		int start = 0;
		int mid = (start+end)/2;
		boolean flag = false;
		while(start <= end) {
			if(target == A[mid]) {
				flag = true;
				System.out.println(mid);
				break;
			}else if(target < A[mid]){
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		
	}

}
