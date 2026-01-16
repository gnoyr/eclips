package d0116;

public class SelectSortTest {
	
	static public void selectsort(int[] arr) {		
		
//		int temp = 0;
//		int idx = 0;
//		int min = 10;
//		//arr의 최소값 찾기 / min보다 작으면 min에 저장 큰값은 temp에 저장
//		
//		for(int cnt = 0; cnt < 5; cnt++) {
//			for(int i = 0; i < 5; i++) {			
//				if(arr[i] < min) {
//					min = arr[i];
//					idx = i;
////					System.out.println(min);
//					
//					
//				}
//			}
//			
//			temp = arr[idx];
//			arr[0] = temp;
//
//		}
		
		for(int i = 0; i < arr.length; i++) {
			int minIndex = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrA = {7, 4, 3, 6, 2};
//		SelectSort arr = new SelectSort(arrA);
		selectsort(arrA);
		for(int i = 0; i<5 ; i++) {
			System.out.println(arrA[i]);
		}
	}

}
