package Ex_0108;

import java.util.Scanner;

public class Test_Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요>> ");
		String name = sc.next();
		System.out.println("전화번호를 입력하세요>> ");
		String phonNum = sc.next();
		System.out.println("성별을 입력하세요>> ");
		char gender = sc.next().charAt(0);
		System.out.println("주소를 입력하세요>> ");
		String address = sc.next();
		
//		String name = "김성룡";
//		int phonNum = 01032011243;
//		char gender = 'M';
//		String address = "부산시";
		
		Member M = new Member(name, phonNum, gender, address);
		
		
//		Member M01 = new Member("김성룡", 01032011243, 'M', "부산");
//		Member M02 = new Member("이유림", 01012431243, 'F', "부산");
//		M01.infoTostring();
		Member_List mList = new Member_List();
		
		//회원 정보 입력 -> 회원정보 list에 저장(info[]) -> in함수를 통해서 

//		mList.add(M01);
//		mList.add(M02);
		mList.add(M);
		mList.linfotoSting();
	}

}
