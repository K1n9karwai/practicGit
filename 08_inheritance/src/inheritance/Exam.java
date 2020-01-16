package inheritance;

import java.util.Scanner;

public class Exam {
	private String name;
	private String dap;
	private char[] ox;
	private int score;
	private final String JUNG="11111";//정답-상수화
	
	public Exam() {
		Scanner scan = new Scanner(System.in);
		ox = new char [5];
		
		System.out.print("이름 입력 : ");
		this.name = scan.next();
		System.out.print("답 입력 : ");
		this.dap = scan.next();
	}
	
	public void compare() {
		for(int i=0; i<dap.length(); i++) {
			if(dap.charAt(i)==JUNG.charAt(i)) {
				ox[i] = 'O';
				score += 20;
			} else {
				ox[i] = 'X';
			}
		}
	}
	
	public String getName() {
		return name;
	}
	
//	public void getOx() {
//		for(int i=0; i<ox.length; i++) {
//			System.out.print(ox[i] + " ");
//		}
//	}
	
	public char[] getOx() {
		return ox;
	}
	
	public int getScore() {
		return score;
	}
}
