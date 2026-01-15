package d0115_01;

import java.util.ArrayList;

public class UserDB{
	ArrayList<User> db = new ArrayList<>();
	
	void add(User user) {
		db.add(user);
	}
	
	void login(User user) {
		for(int i = 0; i < db.size(); i++) {
			if(db.get(i) == user) {
				System.out.println("로그인 성공!");
			}else {
				System.out.println("로그인 실패");
			}
			
		}
	}
}
