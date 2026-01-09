package Ex_0109;
//무한배열 / 인피니티 어레이 클래스 생성 / 필드에 최초의 무한 배열의 크기는 3 / 실행 클래스 생성 / 지역변수 전역변수 이용?
public class InfinityArray {

	private int[]arr = new int[3];
	
	
	//배열 더하기 배열?
//	InfinityArray(int i) {		
//		int[]arr = new int[i];
//	}
	
	//A배열 + B배열?
	
	for(int i = 0; i < 10; i++) {
		int[] saveArr = new int[3+i];

	}
	
	saveArr[0] = arr[0];
	
	
	//배열의 메모리 주소+1?
//	InfinityArray() {		
//		
//	}
//	
//	
//	int[] getArr() {
//		return arr;
//	}
//	
//	void arrAdd() {
//		getArr() = getArr()+ 1;
//	}
	
	void arrtoSting(){
		for(int n = 0; n < 10; n++) {
			System.out.println(arr[n]);
		}
	}
}