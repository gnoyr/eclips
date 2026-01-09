package Ex_0107;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		char d = 66;
		char e = '\u0043';
		char f = '\uAC00';
				
		System.out.println(c); //A
		System.out.println(d); //B
		System.out.println(e); //c
		System.out.println(f); //가
		System.out.println((int)c);
		
		System.out.println("char 크기 : " + Character.BYTES +"bytes");
		System.out.println("char 최대값 : " + (int)Character.MAX_VALUE);
		System.out.println("char 최소값 : " + (int)Character.MIN_VALUE);
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(char i = 65; i <= 90; i++) {
			System.out.print((char)i+" ");
		}
		System.out.println();
		System.out.println('A'+'B');
		
		char[] arr = {'A', 'B', 'C'};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input >>>");
		int input = sc.nextInt();
//		String input_next = sc.next();
//		System.out.println(input_next);
		
		sc.nextLine();
		
		System.out.println("Input >>>");
		String input_nextLine = sc.nextLine();
		System.out.println(input_nextLine);
	}
}