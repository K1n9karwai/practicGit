package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String start;
		String playNum;
		int[] com = new int[3];
		int[] user = new int[3];
		int strike = 0;
		int ball = 0;

		LOOP: while (true) {
			System.out.print("게임을 실행하시겠습니까?(Y/N) : ");
			start = br.readLine();
			if (start.equals("Y") || start.equals("y")) {
				System.out.println("게임을 시작합니다.");

				for (int i = 0; i < com.length; i++) {
					com[i] = (int) (Math.random() * 9) + 1;

					for (int j = 0; j < i; j++) {
						if (com[i] == com[j]) {
							i--;
							break;
						}
					}
				}
//				System.out.print(rightAnswer[0]);
//				System.out.print(rightAnswer[1]);
//				System.out.print(rightAnswer[2]);
//				System.out.println();

				while (true) {
					System.out.print("숫자 입력 : ");
					playNum = br.readLine();
					// System.out.println(playNum.charAt(0));
					for (int i = 0; i < user.length; i++) {
						user[i] = (playNum.charAt(i)) - 48;
						//System.out.print(playNumArr[i]);
					}
					System.out.println();
					for (int i = 0; i < com.length; i++) {
						for (int j = 0; j < user.length; j++) {
							if (com[i] == user[j]) {
								if (i == j) {
									strike++;
								} else {
									ball++;
								}
							} // else if(rightAnswer[i]==playNumArr[i+1]&&)
						} // System.out.println("스트라이크 : " + strike);
							// System.out.println("볼 : " + ball);
					}
					if (strike == 0 && ball == 0) {
						System.out.println(strike + "스트라이크 " + ball + "볼");
					} else if (strike == 3) {
						System.out.println(strike + "스트라이크 " + ball + "볼");
						break LOOP;
					} else {
						System.out.println(strike + "스트라이크 " + ball + "볼");
					}
					System.out.println();
					strike = 0;
					ball = 0;
				}
			} else if (start.equals("N") || start.equals("n")) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				continue;
			}
		}

	}

}
/*
[문제4] 야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼
*/