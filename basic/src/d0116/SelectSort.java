package d0116;

public class SelectSort {

	public void selectsort(int[]arr) {		
		//arr의 최소값 찾기
		for(int i = 0; i < arr.length-1; i++) {
			int temp;
			if(arr[i] > arr[i+1]) {
				arr[0] = arr[i+1];				
			}
		}
	}	
}
