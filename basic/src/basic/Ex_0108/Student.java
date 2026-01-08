package Ex_0108;

public class Student {
	private String name;
	private int grade;
	private int money;
	
//	Bus bus;
	
	Student(String name, int grade, int money){
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}

	void setGrade(int grade) {
		this.grade = grade;
	}
	
	int getGrade() {
		return grade;
	}
	
	void setMoney(int money) {
		this.money = money;
	}
	
	int getMoney() {
		return money;
	}
	//버스를 탄다 -> 버스를 특정해서 탄다 -> 버스를 탈 때는 요금을 낸다. -> 버스를 타면 가진돈이 차감된다.
	
	void rideBus(Bus Bus) {
//		bus = new bus(); //
		Bus.take(1000);
		money -= 1000; //money = money -1000;		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", money=" + money + ", getName()=" + getName()
				+ ", getGrade()=" + getGrade() + ", getMoney()=" + getMoney() + "]";
	}
	
}

//사칙연산 각각의 함수(static 함수)/실행 클래스 생성 ui담당 출력 사용자 입력/claculator라는 class 생성 사칙연산하는 클래스, 메서드