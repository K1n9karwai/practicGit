package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
		System.out.print("10진수 입력 : ");
		int dec = Integer.parseInt(br.readLine());
		
		if(dec<0) {
			System.out.println("재입력하세요.");
			continue;
		} else if(dec==0) {
			System.out.println("프로그램을 종료합니다.");
			break;
		} else {
			String tmp = "";
			String tmp2 = "";
			int cnt = 0;
			
			while(true) {
				int portion = dec/2;
				int remain = dec%2;
				
				tmp += remain;
				dec = portion;
				tmp2 = tmp;
				
				if(portion == 1) {
					tmp2 += portion;
					break;
				}
			}
			
			int length = tmp2.length();
			
			char[] bin = new char[length];
			
			for(int i=0; i<bin.length; i++) {
				bin[i] = tmp2.charAt(--length);
				
				System.out.print(bin[i]);
				++cnt;
				if(cnt%4==0) {
					System.out.print(" ");
				}
			}
			System.out.println();
	}
	}
}
}

/*
[문제2]
10진수를 입력하여 2진수로 변환하시오
0이 입력되면 프로그램을 종료하세요
음수가 입력되면 재입력하세요
4개씩 끊어서 보여주기
Integer.toBinaryString() 쓰지마삼

[실행결과]
10진수 입력 : -5

10진수 입력 : 250
1111 1010 

10진수 입력 : 12
1100

10진수 입력 : 0
프로그램을 종료
*/

