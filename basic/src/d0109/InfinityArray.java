package d0109;
//무한배열 / 인피니티 어레이 클래스 생성 / 필드에 최초의 무한 배열의 크기는 3 / 실행 클래스 생성 / 지역변수 전역변수 이용?
public class InfinityArray {
	private int[] arr;
	
	InfinityArray() {		
		arr = new int[3];
	}
	
	void add(int cnt, int input) {
		for(int i = 0; i < cnt; i++) {
			arr[i] = input;
		}
	}
	
	
	
	void arrtoSting(){
		for(int n = 0; n < 3; n++) {
			System.out.println(arr[n]);
		}
	}
}