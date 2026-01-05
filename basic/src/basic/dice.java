package basic;

import java.util.Random;

public class dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int rdnum = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		
		for(int i = 0; i < 6; i++) {
			rdnum = rd.nextInt(6)+1;
			
			System.out.println("주사위 : "+rdnum);
			if(rdnum == 1) {
				one++;
			}else if(rdnum == 2) {
				two++;
			}else if(rdnum == 3) {
				three++;
			}else if(rdnum == 4) {
				four++;
			}else if(rdnum == 5) {
				five++;
			}else{
				six++;
			}
		}
		System.out.println("1 : "+one+"\n2 : "+two+"\n3 : "+three+"\n4 : "+four+"\n5 : "+five+"\n6 : "+six);
	}
}