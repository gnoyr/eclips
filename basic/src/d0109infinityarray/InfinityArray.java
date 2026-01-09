package d0109infinityarray;

public class InfinityArray {
	int[] arr;
	
	InfinityArray() {
		arr = new int[3];
	}
	
	void add(int n) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = n;
		}
	}
	
}
