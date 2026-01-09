package d0109;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//회원가입		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id를 입력하세요>> ");
		String id = sc.next();
		if(id.length() < 4) {
			System.out.println("id는 4자 이상!");
		}
		System.out.println("비밀번호를 입력하세요>> ");
		String password = sc.next();
		if(password.length() < 8) {
			System.out.println("password는 8자 이상!");
		}
		System.out.println("이름을 입력하세요>> ");
		String name = sc.next();
		System.out.println("성별을 입력하세요>> ");
		String gender = sc.next();
		
		SignUp member01 = new SignUp(id, password, name, gender);
		
		System.out.println("회원가입 완료!");

		//로그인		
		System.out.println("로그인 하세요");

		System.out.println("id를 입력하세요>> ");
		String logInId = sc.next();
		if(id.length() < 4) {
			System.out.println("id는 4자 이상!");
		}
		System.out.println("비밀번호를 입력하세요>> ");
		String logInPassword = sc.next();
		if(id.length() < 8) {
			System.out.println("password는 8자 이상!");
		}
		if(member01.getId().equals(logInId) && member01.getPassword().equals(logInPassword)) {
			System.out.println(member01.getName() + "님 로그인 되었습니다.");
		}else {
			System.out.println("id 또는 비밀번호를 확인 하세요!");
		}
	}

}