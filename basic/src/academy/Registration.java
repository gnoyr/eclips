package academy;

public class Registration {
	Students[] stList = new Students[3];
	int idx = 0;
	int cnt = 0;
	
	void add(Students students) {
		stList[idx++] = students;
	}
	
	void stinfotoString() {
		for(int i = 0; i < idx; i++) {
			System.out.println(stList[i].toString());
		}
	}
	
	void search(String name) {
		for(int cnt = 0; cnt < idx; cnt++){
			if((name.equals(this.stList[cnt].name)) || (name.equals(this.stList[cnt].phonNum))) {
				System.out.println(this.stList[cnt].toString());
			}else {
				System.out.println("다시찾아주세요!!");
			}			
		}		
	}

}
