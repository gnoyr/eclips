package Ex_0108;

public class Bus {
	private String busNum;
	private int passengerCnt;
	private int money;
	
	Bus(String busNum){
		this.busNum = busNum;
	}
	
	public String getBusNum() {
		return busNum;
	}
	public void setBusNum(String busNum) {
		this.busNum = busNum;
	}
	public int getPassengerCnt() {
		return passengerCnt;
	}
	public void setPassengerCnt(int passengerCnt) {
		this.passengerCnt = passengerCnt;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	void take(int cost) {
		money = money + cost;
		passengerCnt++;
	}
	
	@Override
	public String toString() {
		return "Bus [busNum=" + busNum + ", passengerCnt=" + passengerCnt + ", money=" + money + ", getBusNum()="
				+ getBusNum() + ", getPassengerCnt()=" + getPassengerCnt() + ", getMoney()=" + getMoney() + "]";
	}
	
}
