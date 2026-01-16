package d0116;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMethod {
	
	void add(){
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		ArrayList<String> arr = new ArrayList<String>();
		
		while(true) {
			System.out.println("추가할 한국어를 입력하세요>> ");
			String kor = sc.next();
			System.out.println("추가할 영단어를 입력하세요>> ");
			String eng = sc.next();
			map.put(kor, eng);			
			arr.add(kor); // 퀴즈용 한글 단어 배열 값 추가			
			System.out.println("그만? 0 , 계속? 1>>");
			int end = sc.nextInt();
			if(end == 0) {
				break;
			}	
		}
	}
	
	void select() {
		//조회
		System.out.println("-------------조회-------------");

		while(true) {
			System.out.println("한국어 입력 >> ");
			
			String kor = sc.next();		
			String eng = map.get(kor);
			System.out.println(kor + " : " + eng);
			System.out.println("그만? 0 , 계속? 1 >>");
			int end = sc.nextInt();
			if(end == 0) {
				break;
			}
		}	
	}
	
	void quiz() {
		//퀴즈
		
		System.out.println("-------------퀴즈-------------");
		
		rdnum = rd.nextInt(arr.size());
		String kor = arr.get(rdnum);
		while(true) {
			System.out.println(kor + "? >> ");
			String a = sc.next();
			String eng = map.get(kor);
			if(a.equals(eng)) {
				System.out.println("정답");
				break;
			}else {
				System.out.println("다시");
			}			
		}
	}
	
}
	