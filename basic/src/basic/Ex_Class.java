package Ex_0105;

import java.util.Scanner;

public class Ex_Class {

	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int sub(int x, int y) {
		return x - y;
	}

	public static int mul(int x, int y) {
		return x * y;
	}
	
	public static int div(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		int[]A = new int [4];
		int cnt = 0;
		while(true) {
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("수를 입력하세요>>>");
			int x = sc1.nextInt();
			Scanner sc2 = new Scanner(System.in);
			System.out.println("수를 입력하세요>>>");
			int y = sc2.nextInt();
			Scanner sc3 = new Scanner(System.in);
			System.out.println("1.+ 2.- 3.* 4./");
			int oper = sc3.nextInt();
			
			
			if(oper==1) {
				int result = add(x, y);
				System.out.println(x+"+"+y+"="+result);
			}else if(oper==2) {	
				int results = sub(x, y);
				System.out.println(x+"-"+y+"="+results);
			}else if(oper==3) {
				int resultm = mul(x, y);
				System.out.println(x+"*"+y+"="+resultm);
			}else if(oper==4){
				int resultd = div(x, y);
				System.out.println(x+"/"+y+"="+resultd);
			}else{
				if(cnt>2) {
					System.out.println("연산자 확인!!");
				}else {
					System.out.println("연산자를 다시 선택해주세요.");
				}
				cnt++;
			}
			A[oper-1]++;
			Scanner sc4 = new Scanner(System.in);
			System.out.println("0.stop 1.continue");
			int stop = sc4.nextInt();
			if(stop==0) {
				System.out.println("덧셈은 총"+A[0]+"번 사용했습니다.");
				break;
			}
		}
	}

}
