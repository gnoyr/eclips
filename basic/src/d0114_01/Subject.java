package d0114_01;

public class Subject {
	int score;
	String name;
	
	Subject(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return " " + name + " " + score;
	}
	

}
