package d0115_01;
//게시글 내용 / 작성자(로그인한사람의 id) / 제목 / 번호(자동)
public class Board {
	private static int numcnt;
	private int num;
	private String id;
	private String title;
	private String detail;
	
	Board(String id, String title, String detail){
		num = ++numcnt;
		this.id = id;
		this.title = title;
		this.detail = detail;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "번호" + num + "사용자" + id + "제목" + title + "내용" + detail;
	}
	
	
}
