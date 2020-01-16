package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGame {

	public static void main(String[] args) throws IOException {
		int com, user;
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			count = 0;
			com = (int) (Math.random() * 100 + 1);// 1~100
		while (true) {
			System.out.println("숫자 입력 : ");
			user = Integer.parseInt(br.readLine());
			count++;
			
			if (user == com) {
				break;
			} else if (user > com) {
				System.out.println(user + "보다 작습니다.");
			} else {
				System.out.println(user + "보다 큽니다.");
			}
		}
		
		System.out.println("딩동댕 " + count + "번만에 맞추셨습니다.");
		System.out.println("또 할래?(Y/N)");
		String again = br.readLine();
		if(again.equals("N")||again.equals("n")) break;
		}while(true);
		System.out.println("프로그램을 종료합니다.");
	}
}
		
	

////숫자맞추기 게임
//1~100사이의 난수를 발생하여 맞추는 게임
//
//[실행결과]
//숫자 입력 : 50
//50보다 큽니다.
//
//숫자입력 : 90
//90보다 작습니다.
//
//...
//
//숫자 입력 : 87
//딩동댕 xx번만에 맞추셨습니다.