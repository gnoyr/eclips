package d0115_01;

import java.util.Scanner;

public class BoardUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//회원가입
//		System.out.println("--------------회원가입--------------");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ID를 입력하세요 >> ");
//		String id = sc.next();
//		System.out.println("비밀번호를 입력하세요 >> ");
//		String password = sc.next();
//		User user = new User(id, password);
//		UserDB userdb = new UserDB();
//		userdb.add(user); //사용자 데이터베이스에 추가
//		System.out.println("------------회원가입 완료------------");
//		
//		//로그인
//		System.out.println("--------------로그인----------------");
//		System.out.println("ID를 입력하세요 >> ");
//		String logid = sc.next();
//		System.out.println("비밀번호를 입력하세요 >> ");
//		String logpw = sc.next();
		
		
		Board board01 = new Board("aaa", "제목01", "내용A");
		Board board02 = new Board("bbb", "제목02", "내용B");
		Board board03 = new Board("ccc", "제목03", "내용C");
		
		BoardDB db = new BoardDB();
		
		//게시물 등록
		db.create(board01);
		db.create(board02);
		db.create(board03);
			
		//게시물 모두 출력
		db.readAll();
			
		//게시물 하나만 출력
		db.readOne(1);
			
		BoardDBPlus dbp = new BoardDBPlus();
		//게시물 등록
		dbp.create(board01);
		dbp.create(board02);
		dbp.create(board03);
		
		//게시물 모두 출력
		dbp.readAll();
	}

}
