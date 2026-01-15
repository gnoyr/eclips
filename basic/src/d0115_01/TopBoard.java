package d0115_01;

import java.util.ArrayList;

public class TopBoard {
	
	protected ArrayList<Board> db = new ArrayList<>();
	
	public void create(Board board) {
		
	}
	
	public void readAll() {
		for(Board b : db) {
			System.out.println(b);
		}		
	}
	
	public void readOne(int num) {
		Board s = db.get(num);
		System.out.println(s);		
	}
}
