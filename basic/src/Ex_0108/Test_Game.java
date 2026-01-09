package Ex_0108;

import java.util.Scanner;

public class Test_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game01 = new Game();
		
		for(int i = 0; i<game01.word.length; i++) {
			System.out.print(game01.blind[i]);	
		}
		System.out.println();
		
		while(true) {
			System.out.println("단어 입력 >> ");
			Scanner sc = new Scanner(System.in);
			char input = sc.next().charAt(0);
			
			game01.guess(input);
			System.out.println();
		}		
	}

}
