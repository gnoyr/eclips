package d0115;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println("1. 빈 arrayList 생성 : " + fruits);
		System.out.println("초기 크기 : " + fruits.size());
		System.out.println("비어있나 : " + fruits.isEmpty());
		
		//요소 추가
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("포도");
		System.out.println("2. 요소 추가 후 : " + fruits);
		System.out.println("현재 크기 : " + fruits.size());
		System.out.println("비어있나 : " + fruits.isEmpty());
		
		//특정 위치에 요소 추가
		fruits.add(1, "배");
		System.out.println("2. 요소 추가 후 : " + fruits);
		
		//특정 위치의 요소 값 얻기
		String s = fruits.get(1);
		System.out.println(s);
		String n = fruits.get(fruits.size()-1);
		System.out.println(n);
		
		//특정 위치에 요소의 값 수정
		fruits.set(3, "멜론");
		System.out.println(fruits);
		
		//요소의 삭제
		fruits.remove(1);
		System.out.println(fruits);
		fruits.remove("바나나");
		System.out.println(fruits);
		
		
		boolean tf = fruits.contains("포도");
		if(tf) {
			System.out.println("있어요");
		}else {
			System.out.println("없어요");			
		}
		
		System.out.println(fruits.indexOf("바나나"));
		
		fruits.add("사과");
		System.out.println(fruits);
		
		System.out.println(fruits.indexOf("사과"));
		System.out.println(fruits.lastIndexOf("사과"));
		
		for(int i = 0; i < fruits.size(); i++) {
			System.out.print(fruits.get(i));
		}
		for(String x : fruits) {
			System.out.print(x);			
		}
	}

}
