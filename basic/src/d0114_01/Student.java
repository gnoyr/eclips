package d0114_01;
//성적 처리 프로그램 / 학생들은 국수영 성적/student 클래스 int sno, string name, Subjects[] subject/ 과목명 점수(0~100)/학생 5명/학생 성젹표 출력
public class Student {
	int sno;
	String name;
	Subject[] subjects;
	
	Student(int sno, String name, int math,  int english, int korean){
		this.sno = sno;
		this.name = name;
		subjects = new Subject[3];
		
		subjects[0] = new Subject("국어", korean);
		subjects[1] = new Subject("영어", english);
		subjects[2] = new Subject("수학", math);

	}
	
	void showStudents() {
		System.out.print(sno + " " + name);
		for(int idx = 0 ; idx < 3; idx++ ) {
			System.out.print(subjects[idx].toString());			
		}
	}
}
