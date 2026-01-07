package Ex_0107;

public class Test_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student stu1 = new Student();
//		stu1.no = 1;
//		stu1.name = "황영현";
//		stu1.gender = 'M';
////		stu1.f();
//		
//		Student stu2 = new Student();
//		stu2.no = 2;
//		stu2.name = "양대선";
//		stu2.gender = 'M';                                    
////		stu1.f();
//		
//		Student stu3 = new Student();
//		stu3.no = 3;
//		stu3.name = "황보승재";
//		stu3.gender = 'M';
////		stu1.f();
//		
//		Student stu4 = new Student();
//		stu4.no = 4;
//		stu4.name = "심성숙";
//		stu4.gender = 'F';
////		stu1.f();
//		
//		Student stu5 = new Student();
//		stu5.no = 5;
//		stu5.name = "표민지";
//		stu5.gender = 'F';
////		stu1.f();
		
		Student stu01 = new Student();
		Student stu02 = new Student("유주아", 'F');
		Student stu03 = new Student("황유연", 'F');
		
//		System.out.println(stu01.no + " " + stu01.name + " " + stu01.gender);
//		System.out.println(stu02.no + " " + stu02.name + " " + stu02.gender);
//		System.out.println(stu03.no + " " + stu03.name + " " + stu03.gender);

//		System.out.println(stu01.infotostring());
		
//		stu02.name = "둘리";
//		System.out.println(stu02.no + " " + stu02.name + " " + stu02.gender);
//		System.out.println(stu02.no + " " + stu02.rename("고길동") + " " + stu02.gender);
//		stu02.regender('M');
		System.out.println(stu02.no + " " + stu02.getname()+ " " + stu02.getgender());
		stu02.setage(10);
		System.out.println(stu02.no + " " + stu02.getname()+ " " + stu02.getgender() + " " + stu02.getage());
		
//		stu01.infotostring();
		
//		System.out.println("총 학생 수:"+Student.cnt);
	}
}
