package d0115;

public class InfinityArrayAdd<T> {
	Object [] arr;
	int idx;
	
	InfinityArrayAdd() {
		arr = new Object[3];
	}
	
	public void add(T n) {
		
		if(idx >= arr.length) {
			Object[] temp = new Object[arr.length+1];
			for(int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
		}
		arr[idx] = n;
		idx++;
		
	}
		
	public void add(int index, T n) {
		Object[] front = new Object[index];
		for(int i = 0; i < index; i++) {
			
		}
		
		Object[] temp = new Object[arr.length+1];
		for(int i = index+1 ; i < arr.length; i++) {
			temp[i] = front[i];
			
		}
		
		
//		if(idx >= arr.length) {
//			Object[] temp = new Object[arr.length+1];	
//			for(int i = 0; i < arr.length; i++) {
//				temp[i] = arr[i];
//			}
//			arr = temp;
//		}
//		arr[index] = n;
//		idx++;
		
		
		//index+1부터 arr.length까지의 temp 값을 index+1에 저장 -> index에 n 값 넣기
	}
	
//	public T get(int index) {
//		return arr[index];
//	}
	
	public void showArr() {
		for(int i = 0; i<idx; i++) {
			System.out.println(arr[i] + " ");
		}
	
	}
}
