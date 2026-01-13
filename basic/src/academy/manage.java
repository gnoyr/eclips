package academy;

import java.util.Scanner;

public class manage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//등록
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름 >>");
		String name = sc.next();
		System.out.println("학생 연락처 >>");
		String phonNum = sc.next();
		
		Students st = new Students(name, phonNum);		
		
		//학생부 저장
		Registration stList = new Registration();
		stList.add(st);
		stList.stinfotoString();
		System.out.println("학생부 저장 완료!");
		
		//학생부 조회
		System.out.println("학생 이름 또는 연락처를 입력하세요 >>");
		String searchName = sc.next();
		stList.search(searchName);
		
		//학생부 수정
		System.out.println("학생부 수정");
		System.out.println("1. 이름, 수정할 이름 2. 전화번호, 수정할 전화번호 >>");
		int modi = sc.nextInt();
		
	}
}
