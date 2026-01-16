package d0116;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

//등록 조회 퀴즈
public class Dictionary {
	public static void main(String[] args) {
		
		//등록
		Map<String, String> map = new HashMap<>();
		ArrayList<String> arr = new ArrayList<String>();
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int rdnum = 0;
		int i = 0;

//		arr.add("들고가다");
//		arr.add("받다");
//		arr.add("가지다");
//		arr.add("만들다");
//		arr.add("찾다");
//		
//		map.put("들고가다", "take");
//		map.put("받다", "get");
//		map.put("가지다", "have");
//		map.put("만들다", "make");
//		map.put("찾다", "find");
		
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
