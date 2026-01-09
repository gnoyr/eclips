package vendingMachine;

import java.util.Scanner;

public class InputMoney {
	
	
	
	Scanner sc = new Scanner(System.in);
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
}
