package Ex_0107;

public class Bus {
	int no;
	private int passenger;
	private int summoney;
	
	Bus(){
		no = 123;
		passenger = 2;
		summoney=1000;
	}
	
	void setNo(int no) {
		this.no = no;
	}
	
	int getNo() {
		return no;
	}
	
	void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	
	int getPassenger() {
		return passenger;
	}
	
	void setSummoney(int summoney) {
		this.summoney = summoney;
	}
	
	int getSummoney() {
		return summoney;
	}
	
	void takem(int cnt) {
		passenger = passenger + 1;
		summoney = summoney + cnt;
		System.out.println(no + "번 " + passenger + "명 " + summoney + "원");
	}
	
}
