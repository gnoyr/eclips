package Ex_0108;

public class Member_List {
//	String[] name = new String[10];
//	int[] phonNum = new int[10];
//	char[] gender = new char[10];
//	String[] address = new String[10];
	int idx = 0;
	
	Member[] info = new Member[10];
	
	void add(Member mInfo){
		info[idx++] = mInfo;
	}
	
	void linfotoSting(){
		for(int i = 0; i < idx; i++) {
			System.out.println(info[i].infoTostring());
			
		}
	}
}
