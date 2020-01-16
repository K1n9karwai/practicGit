package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice6 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("중간고사 점수를 입력하세요 : ");
		int mt = Integer.parseInt(br.readLine());
		System.out.print("기말고사 점수를 입력하세요 : ");
		int ft = Integer.parseInt(br.readLine());
		System.out.print("레포트 점수를 입력하세요 : ");
		int report = Integer.parseInt(br.readLine());
		System.out.print("출석 점수를 입력하세요 : ");
		int come = Integer.parseInt(br.readLine());
		
		double mfPoint = ((mt+ft)/2*0.6);
		double rPoint = report*0.2;
		double cPoint = come*0.2;
		double totalPoint = mfPoint + rPoint + cPoint;
		String grade = null;
		String grade2 = null;
		
		switch (((int)totalPoint/10)) {

		case 10:
		case 9: {
			grade = "A";
			grade2 = "excellent";
		} break;
		case 8: {
			grade = "B";
			grade2 = "excellent";
		} break;
		case 7: {
			grade = "C";
			grade2 = "good";
		} break;
		case 6: {
			grade = "D";
			grade2 = "good";
		} break;

		default: {
			grade = "F";
			grade2 = "poor";
		} break;
		}
		
		System.out.println("성적 = " + String.format("%.2f", totalPoint));
		System.out.println("학점 = " + grade);
		System.out.println("학점 = " + grade2);
		
	}
}
/*
[문제6]
문제5번에서 조건2, 조건3의 if문으로 처리한 것을 switch로 바꾸시오
*/
 