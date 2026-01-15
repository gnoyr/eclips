package d0115_01;

import java.util.ArrayList;

//콘솔형 게시판 게시글의 DB를 arraylist를 하나의 클래스로(BoardDB)데이터베이스
//crud 클래스파일 인스턴스 생성코드

public class BoardDB {
	private ArrayList<Board> db = new ArrayList<>();
	
	public void create(Board board) {
		db.add(board);
	}
	
	public void readAll() {//10개의 게시물 모두 출력
		for(Board b : db) {
			System.out.println(b);
		}
		
//		for(int i = 0; i < db.size(); i++) {
//			Board s = db.get(i);
//			System.out.println(s.getTitle() + " " + s.getNum() + " " +s.getId() + " " + s.getDetail());
//		}
	}
	
	public void readOne(int num) { //10개의 게시물 중에서 3번째 게시물만 출력
		Board s = db.get(num);
		System.out.println(s);		
	}
	
	//
}
