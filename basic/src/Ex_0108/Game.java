package Ex_0108;

import java.util.Scanner;

public class Game {
	char[] word = new char[5];
	char[] blind = new char[5];

	Game(){
		word[0] = 'a';
		word[1] = 'p';
		word[2] = 'p';
		word[3] = 'l';
		word[4] = 'e';
		for(int i = 0; i < word.length; i++) {
			blind[i] = '*';	
		}
		
	}
	
	//word 0부터 5까지 select 값과 비교
	int cnt = 0;
	void guess(char select) {
		for(int i = 0; i < word.length; i++) {
			if(word[i] == select) {
				blind[i] = select;
				cnt++;
			}
		}	
		
		for(int cnt = 0; cnt < word.length; cnt++) {
			System.out.print(blind[cnt]);
		}
		
		if(cnt==word.length) {
			System.out.println();
			System.out.println("정답");
		}
	}
	
}
