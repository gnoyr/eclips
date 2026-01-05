package basic;

import java.util.Random;
import java.util.Scanner;

public abstract class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int rdNum = rd.nextInt(3)+1;
		int lose = 0;
		int win = 0;
		int draw = 0;
		int n = 0;
		System.out.println("rdnum :" + rdNum);
		
		while(n<5) {
			Scanner sc = new Scanner(System.in);
			System.out.print("수를 입력하세요 >>>");
			int input = sc.nextInt();
			
			System.out.println("input : " + input);
			
			if(input == 0 && rdNum == 1) {
				System.out.println("패");
				lose = lose + 1;
			}else if(input == 0 && rdNum == 2) {
				System.out.println("승");
				win = win + 1;
			}else if(input == 1 && rdNum == 0) {
				System.out.println("승");
				win = win + 1;
			}else if(input == 1 && rdNum == 2) {
				System.out.println("패");
				lose = lose + 1;
			}else if(input == 2 && rdNum == 0) {
				System.out.println("패");
				lose = lose + 1;
			}else if(input == 2 && rdNum == 1) {
				System.out.println("승");
				win = win + 1;
			}else {
				System.out.println("무");
				draw = draw + 1;
			}
			n = n + 1;
		}

	}

}
