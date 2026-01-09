package d0109;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			System.out.println("id를 입력하세요>> ");
			String id = sc.next();
			if(id.length() < 4) {
				System.out.println("id는 4자 이상!");
			}else {
				break;
				}
		}
		while(flag) {
			System.out.println("비밀번호를 입력하세요>> ");
			String password = sc.next();
			if(password.length() < 8) {
				System.out.println("password는 8자 이상!");
			}else {
				break;
				}
		}
		while(flag) {
			System.out.println("이름을 입력하세요>> ");
			String name = sc.next();
			if(name.length() < 0) {
				System.out.println("이름을 입력해주세요!");
			}else {
				break;
			}
		}	

		while(flag) {
			System.out.println("성별을 입력하세요>> ");
			String gender = sc.next();
			if(gender == null) {
				break;
			}else if(gender.isEmpty()) {
				break;
			}else if(gender.isBlank()) {
				break;
			}
		}
		
	}
}

