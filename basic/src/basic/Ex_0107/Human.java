package Ex_0107;
//class이름 Human/ 사람은 최대 100살까지 삶/담배를 하나 피면 1살씩 수명이 줆/ 술을 한병씩 먹을 때 마다 두살씩 줆/필드 => 이름, 성별, 나이/수명을 조회했을 때 수명이 줄어듬.
public class Human {
	private String name;
	private char gender;
	private int age;
	
	Human(){
		name = "홍길동";
		gender = 'M';
		age = 40;
	}
	
	void setage(int age) {
		if(age<0) {
			System.out.println("다시입력");
		}else if(age>100) {
			System.out.println("다시입력");
		}else {
			this.age = age;
		}		
	}
	
	int getage() {
		return age;
	}
	
	void setname(String name) {
		this.name = name;
	}
	
	String getname() {
		return name;
	}
	
	void setgender(char gender) {
		this.gender = gender;
	}
	
	char getgender() {
		return gender;
	}
	
//	void bad(String bad) {	
//		if(bad == "담배") {
//			age = age - 1;
//		}else if(bad == "술") {
//			age = age - 2;
//		}else {
//			System.out.println("다시입력");
//		}
	
	void ciga(int cnt) {
		age = age - cnt;
	}
	void drink(int cnt) {
		age = age - (cnt*2);
	}
}