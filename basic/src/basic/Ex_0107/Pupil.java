package Ex_0107;

public class Pupil {
	private String name;
	private int grade;
	private int money;
	
	Pupil(){
		name = "김성룡";
		grade = 3;
		money = 5000;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setGrade(int grade){
		this.grade = grade;
	}
	
	int getGrade() {
		return grade;
	}
	
	void setMoney(int money){
		this.money = money;
	}
	
	int getMoney(int money) {
		return money;
	}
	
	void busin() {
		money = money - 1000;
		//버스타면 버스 총요금에서 까짐 연동
		System.out.println(name + " " + grade + "학년 " + money + "원");
	}
}
