package Ex_0107;
//student 클래스 만들고 번호 이름 성별 만들기 / cnt 변수 정적변수 만들기 초기화 0으로 세팅/ 다섯명의 학생 만들기 / cnt =>현재 까지 저장된 학생이 몇명인지 / f함수 cnt 1씩 증가시킴.
//infotostring 함수 생성 / 학생정보를 문자열로 반환

public class Student {
	int no;
	private String name;
	private char gender;
	static int cnt = 0;
	private int age;
	
	Student(){
		no = 1;
		name = "홍길동";
		gender = 'M';
		cnt++;
	}
	
	Student(String name, char gender){ //생성자
		no = ++cnt;
		this.name = name;
		this.gender = gender;
	}

	String infotostring() {
		return "번호 : " + no + "이름 : " + name + "성별 : " + gender;
	}
	
	String rename(String name) {
		this.name = name; //setter => 매개 변수O
		return name;
	}
	
	void regender(char gender) {
		this.gender = gender;
	}
	
	String getname() {
		return name; //getter ->  매개 변수 X
	}
	
	char getgender() {
		return gender;
	}
	
	void setage(int age) {
		if(age>0) {
			this.age = age;
		}else {
			System.out.println("다시입력");
		}
	}
	
	int getage() {
		return age;
	}
//	void infotostring() {
//		String str = no + " " + name + " " + gender;
//		System.out.println(str);
//	}
	
//	void f() {
//		cnt++;
//	}
}