package Ex_0107;
//유닛이라는 클래스생성/에너지가있음 기본에너지는 5/누군가를 공격할수 있음 attack이라는 메소드 생성/ 대상을 특정해서 공격/공격받은 에너지가 2만큼 줄어듦
public class Unit {
	private String name;
	private int energy;
	
	Unit(String name){
		this.name=name;
		energy = 5;
	}
	
	void setName(String name) {
		this.name = name; 
	}
	
	String getName() {
		return name;
	}
	
	void setEnergy(int energy) {
		this.energy = energy; 
	}
	
	int getEnergy() {
		return energy;
	}
	
	void attack(Unit Unit){
		Unit.energy = Unit.energy - 2;
		
	}
	
}
