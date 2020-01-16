package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice8__ {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice8__ p = new Practice8__();
		int num;
		int balance=0; //잔액
		int deposit; 
		
		while(true) {
			System.out.println("*************************");
			System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
			System.out.println("*************************");
		System.out.print("번호 선택 : ");
		num = Integer.parseInt(br.readLine());
		if(num==4) break;
		if(num==1) balance = p.input(balance);
		else if(num==2) balance = p.output(balance);
		else if(num==3) {
			System.out.println("당신의 잔액은 " + balance + "원 입니다.");
		}
		}//while
		System.out.println("프로그램을 종료합니다.");
		
		
	}

	private int output(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int deposit;
		
		System.out.println("출금액 : ");
		deposit = Integer.parseInt(br.readLine());
		
		if(balance>=deposit) {
			balance -= deposit;
			System.out.println("당신의 잔액은 " + balance + "원 입니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
		return balance;
	}

	private int input(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int deposit;
		
		System.out.println("예금액 : ");
		deposit = Integer.parseInt(br.readLine());
		
		if(deposit%10000==0) {
			balance += deposit;
			System.out.println("당신의 잔액은 " + balance + "원 입니다.");
		} else {
			System.out.println("만원 단위로 입력허세요.");
		}
		
		return balance;
	}
}
