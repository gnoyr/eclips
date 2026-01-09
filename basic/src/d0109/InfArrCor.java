package d0109;

public class InfArrCor {
	private int[] arr;
	private int idx;
	
	InfArrCor() {
		arr = new int[3];
	}
	
	//무한 배열 코드
	public void add(int n) {
		if(idx >= arr.length){
			int[] temp = new int[arr.length+3];
			for(int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}			
			arr = temp;
		}
		arr[idx] = n;
		idx++;
	}
	//
	
	public void showArr() {
		for(int i = 0; i < idx; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void f() {
		arr[0] = 10;
	}
	
	public int f2() {
		return arr[0];
	}
}
