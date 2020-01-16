package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num_1, num_2, val, score = 0, sw = 0;
		int sw2 = 0;
		String out;
		
		while (sw2 == 0) {
			score = 0;
			sw = 0;
			for (int i = 1; i <= 5; i++) {
				num_1 = (int) (Math.random() * 90) + 10;
				num_2 = (int) (Math.random() * 90) + 10;
				
				for(int j = 1; j<=2; j++) {
					System.out.print("[" + i + "] " + num_1 + " + " + num_2 + " = ");
					val = Integer.parseInt(br.readLine());
					
					if (num_1 + num_2 == val) {
						System.out.println("딩동댕");
						score += 20;
						sw++;
						break;
					} else {
						if(j==2) System.out.println("틀렸다... 정답 : " + (num_1 + num_2));
						else System.out.println("틀렸다.");
	//					System.out.print("[" + i + "] " + num_1 + " + " + num_2 + " = ");
	////					val = Integer.parseInt(br.readLine());
	////					System.out.println(val);
	////					if (num_1 + num_2 == val) {
	////						System.out.println("딩동뎅");
	////						score += 20;
	////						sw++;
	////					} else {
	////						System.out.println("틀렸다... 정답 : " + (num_1 + num_2));
	////					}
					}
				}//for j
			}//for i
			System.out.println("당신은 총 " + sw + "문제를 맞추어서 " + score + "점 입니다.");

//			while (true) {
				
				do {
					System.out.print("continue(y/n) : ");
					out = br.readLine();
					
				}while(!out.equals("y") || !out.equals("Y") ||!out.equals("n") || !out.equals("N"));
				
//				if (out.equals("y") || out.equals("Y")) {
//					break;
//				} else if (out.equals("n") || out.equals("N")) {
//					System.out.println("프로그램을 종료합니다.");
//					sw2 = 1;
//					break;
//				} else {
//					continue;
//				}
			}
		}
}

/*
 * [문제4] 덧셈 공부 10~99 사이의 난수를 2개(a,b) 발생하여 합을 맞추는 게임 문제수는 총 5문제를 제공한다 1문제당 점수
 * 20점씩 계산 만약 틀리면 기회를 1번 더 제공한다
 * 
 * [실행결과] [1] 25 + 36 = 45 틀렸다 [1] 25 + 36 = 61 딩동뎅
 * 
 * [2] 78 + 10 = 100 틀렸다 [2] 78 + 10 = 95 틀렸다...정답 : ...
 * 
 * 당신의 총 x문제를 맞추어서 xx점 입니다
 * 
 * continue(y/n) : w continue(y/n) : n 프로그램을 종료합니다
 */
