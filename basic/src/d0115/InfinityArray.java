package d0115;
// 
public class InfinityArray<T> {
	Object [] arr;
	int idx;
	
	InfinityArray() {
		arr = new Object[3];
	}
	
	public void add(Object n) {
		if(idx >= arr.length) {
			Object[] temp = new Object[arr.length+3];
			for(int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
		}
		arr[idx] = n;
		idx++;
	}
	
	public void showArr() {
		for(int i = 0; i<idx; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public Object[] getArr() {
		return arr;
	}

	public void setArr(Object[] arr) {
		this.arr = arr;
	}
}
