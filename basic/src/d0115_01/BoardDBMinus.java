package d0115_01;

public class BoardDBMinus extends TopBoard{
	
	public void create(Board board) {
		db.add(board);
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
