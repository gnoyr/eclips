package academy;

public class Students extends Management{
	String name;
	String phonNum;
	
	Students(String name, String phonNum){
		this.name = name;
		this.phonNum = phonNum;
	}	
	
	public String toString() {
		return name + phonNum;
	}
}
