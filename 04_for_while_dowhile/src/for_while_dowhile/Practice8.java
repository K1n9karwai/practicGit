package for_while_dowhile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practice8 {
	static int total;
	
	public int input(int deposit) {
		return total += deposit;
	}
	
	public int output(int withdraw) {
		return total -= withdraw;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice8 p1 = new Practice8();
		
		while(true) {
			System.out.println("*************************");
			System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
			System.out.println("*************************");
		System.out.print("번호 선택 : ");
		int num = Integer.parseInt(br.readLine());

		if (num == 1) {
			while (true) {
				System.out.print("예금액 : ");
				int deposit = Integer.parseInt(br.readLine());
				if (deposit % 10000 == 0) {
					p1.input(deposit);
					System.out.println("당신의 잔액은 " + total + "원 입니다.");
					break;
				} else {
					System.out.println("만원 단위로 다시 입력하세요.");
				}
			}
		} else if(num == 2) {
			while(true) {
			System.out.println("출금액 : ");
			int withdraw = Integer.parseInt(br.readLine());
			if(withdraw<total) {
				p1.output(withdraw);
				System.out.println("당신의 잔액은 " + total + "원 입니다.");
				break;
			} else {
				System.out.println("잔액이 부족합니다.");
			}
			
			}
		} else if(num==3) {
			System.out.println("당신의 잔액은 " + total + "입니다.");
		} else if(num==4) {
			System.out.println("프로그램을 종료합니다.");
			break;
		} else {
			System.out.println("번호를 잘못 입력하였습니다.");
		}
		}
	}
}

/*
 * [문제8] 계좌관리 프로그램 예금, 출금, 잔고, 종료 기능을 제공하는 간단 계좌관리 프로그램을 작성하시오. 조건) 예금은 input(),
 * 출금은 output()에서 처리하세요
 * 
 * [실행결과]
 ****************
 * 1. 예금 2. 출금 3. 잔고 4. 종료
 ****************
 * 번호 선택 : 1
 * 예금액 : 10000
 * 당신의 잔액은 10000원 입니다 
 * 또는
 * 예금액 : 12000 만원 단위로 입력하세요
 ****************
 * 
 * 1. 예금 2. 출금 3. 잔고 4. 종료
 ****************
 * 번호 선택 : 2
 * 출금액 : 8000
 * 당신의 잔액은 2000원 입니다
 * 또는
 * 출금액 : 18000 잔액이 부족합니다
 * 
 * 1. 예금 2. 출금 3. 잔고 4. 종료
 * 번호 선택 : 3
 * 당신의 잔액은 2000원 입니다
 * 
 * 1. 예금 2. 출금 3. 잔고 4. 종료
 * 번호 선택 : 4
 * 프로그램을 종료합니다.
 */
