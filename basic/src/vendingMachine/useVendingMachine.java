package vendingMachine;

import java.util.Scanner;

public class useVendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		VendingMachine ai = new VendingMachine();
		//저장고에 음료 넣기		
//		String[]drink = {"오렌지", "커피", "포카리", "배", "비타민"};
//		int[]charge = {500, 1000, 1500, 1000, 1200};
		
		
		//사용자 음료선택
		System.out.println("1.오렌지 2.커피 3.포카리 4.배 5.비타민 >> ");
		int select = sc.nextInt();
		
		switch(select) {
		case 1: System.out.println(charge[0] + "원");
			//사용자 요금지출
			System.out.println("요금을 넣으세요! >> ");
			int inputCharge = sc.nextInt();
			int saveCharge = inputCharge;
			if(inputCharge == charge[0]) {
				System.out.println(drink[0]);
			}else if(inputCharge < charge[0]) {
				System.out.println(-(inputCharge - charge[0]) + "원을 더 넣어주세요!");
					saveCharge = inputCharge - charge[0];
			}else {
				System.out.println("거스름돈: " + -(charge[0]-inputCharge));
			}
			//
			break;
		case 2: System.out.println(charge[1] + "원");
			break;
		case 3: System.out.println(charge[2] + "원");
			break;
		case 4: System.out.println(charge[3] + "원");
			break;
		case 5: System.out.println(charge[4] + "원");
			break;			
		}
		

	}

}
