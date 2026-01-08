package Ex_0108;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello, World!";
		String str2 = "Java Programming";
		String str3 = "  Hello Java ";
		
		//1. 문자열의 길이
		System.out.println("1. length(): " + str1.length());
		
		//2. 특정 위치의 문자 반환
		System.out.println("2. charAt(): " + str1.charAt(7));
		
		//3. 부분 문자열 추출
		System.out.println("3. substiring(7): " + str1.substring(7));
		System.out.println("4. substiring(7, 12): " + str1.substring(7, 12));
		
		//4. 문자(열)의 첫번째 위치 찾기
		System.out.println("5. indexOf(o): " + str1.indexOf('o'));
		System.out.println("6. indexOf(\"World\"): " + str1.indexOf("World"));
		
		//5. 문자(열)의 마지막 위치 찾기
		System.out.println("7. lastIndexOf('o'): " + str1.lastIndexOf('o'));
		
		//6. 대소문자 변환 : toUpperCase(),
		System.out.println("8. toUpperCase(): " + str1.toUpperCase());
		System.out.println("9. toLowerCase(): " + str1.toLowerCase());
		
		//7. 앞뒤 공백제거
		System.out.println("10. trim(): '" + str3.trim() + "'");
		
		//8. 문자/문자열 치환 - replace()
		System.out.println("11. replace('l', 'L'): " + str1.replace('l', 'L'));
		System.out.println("12. replace(\"World\", \"Java\"): " + str1.replace("World", "Java"));
		
		//9. 문자열 분할 : split()
		String[] words = str1.split(", ");
		System.out.println("13. split(\", \"):");
		for(String word : words) { //향상된 for문
			System.out.println(" - " + word);
		}
		
		//10. 문자열 비교 equals()
		String s1 = "abc";
		String s2 = "abc";
		
		System.out.println(s1.equals(s2)); //문자열 비교는 == 사용x, equals사용!!
	}

}
