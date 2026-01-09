package Ex_0105;

public class Test_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student();
		stu.no = 1;
		stu.name = "홍길동";
		stu.gender = 'M';
		
		Student stu2 = new Student();
		stu2.no = 2;
		stu2.name = "고길동";
		stu2.gender = 'M';
			
		Student stu3 = new Student();
		stu3.no = 3;
		stu3.name = "고길동";
		stu3.gender = 'F';
		
		Student stu4 = new Student();
		stu4.no = 4;
		stu4.name = "고길동";
		stu4.gender = 'F';
		
		Student stu5 = new Student();
		stu5.no = 5;
		stu5.name = "고길동";
		stu5.gender = 'F';
		
		stu.showStudentInfo();
		
		Student[] students = new Student[5];
		students[0] = stu;
		students[1] = stu2;
		students[2] = stu3;
		students[3] = stu4;
		students[4] = stu5;
		
		for(int i = 0; i <5 ; i++) {
			students[i].showStudentInfo();
		}
		
		
	}

}
