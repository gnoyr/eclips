package Ex_0108;
//회원 member 클래스생성, 실행 클래스, 저장 클래스/ 속성 이름, 전화번호, 성별, 주소/회원등록 저장 /조회/ 목록이 나옴./회원은 최대 10명까지 저장
public class Member {
	private String name;
	private String phonNum;
	private char gender;
	private String address;
	
	Member(){
		
	}
	
	Member(String name, String phonNum, char gender, String address){
		this.name = name;
		this.phonNum = phonNum;
		this.gender = gender;
		this.address = address;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setPhonNum(String phonNum ){
		this.phonNum = phonNum;
	}
	
	String getPhonNum() {
		return phonNum;
	}
	
	void setGender(char gender){
		this.gender = gender;
	}
	
	char getGender() {
		return gender;
	}
	
	void setAddress(String address){
		this.address = address;
	}
	
	String getAddress() {
		return address;
	}
	
	String infoTostring(){
		return name + phonNum + gender + address;
	}
}
