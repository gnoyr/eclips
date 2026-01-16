package d0116;

import java.util.HashMap;
import java.util.Map;

public class ExMap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//맵 생성
		Map<String, Integer> map = new HashMap<>();
		
		//맵 요소 추가
		map.put("사과", 1500);
		map.put("바나나", 2000);
		map.put("오렌지", 3000);
		map.put("포도", 4000);
		map.put("포도", 4000);
		
		
		//맵 요소 조회
		Integer price = map.get("포도");
		System.out.println("포도(key)의 값은 (valuse)은 " + price + "입니다.");
		
		price = map.getOrDefault("키위", 0);
		System.out.println("키위의 값은 " + price + "입니다.");
		
		//맵의 크기 조회
		System.out.println("맵에 저장된 자료의 개수 : " + map.size());
		
		//맵이 비어있는지 확인하기
		System.out.println("맵이 비어있나요? >> " + map.isEmpty());
		
		//맵 비우기
//		map.clear();
		
		System.out.println("맵이 비어있나요? >> " + map.isEmpty());
		System.out.println("맵에 저장된 자료의 개수 : " + map.size());
		
		for(String key : map.keySet()) { //map.keyset() = {"사과", "바나나,,,}
			System.out.println("key는 " + key + "이고 value는 " + map.get(key) + "입니다.");
		}

	}

}
