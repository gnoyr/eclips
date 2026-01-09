package d0109;
//id password name // 회원 가입 // 로그인 // 회원가입 -> 필수(id입력 password입력 name입력) 선택((문자열)성별(남자, 여자)) -> "회원가입 완료!" -> "로그인 하세요" -> id입력 password 입력 -> "name님 로그인 되었습니다." //id는 4글자이상 // password는 8글자이상 //id password 틀림 -> "확인하세요."//3번이상 틀리면 오류 메시지 출력
public class SignUp {
	private String id;
	private String password;
	private String name;
	private String gender;
	
//	SignUp(){
//		
//	}

	SignUp(String id, String password, String name, String gender){
		this.id = id;
		this.password = password;
		this.name = name;
		this.gender = gender;
	}
	
	void setId(String id) {
		this.id = id;
	}
	
	String getId() {
		return id;
	}
	
	void setPassword(String password) {
		this.password = password;
	}
	
	String getPassword() {
		return password;
	}

	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setGender(String gender) {
		this.gender = gender;
	}
	
	String getGender() {
		return gender;
	}
	
	String SignUptoString() {
		return id + password + name + gender;
	}
}
