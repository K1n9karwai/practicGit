package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice5 {
	
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
		
		if(totalPoint>=90) {
			grade = "A";
			grade2 = "excellent";
		} else if (totalPoint>=80) {
			grade = "B";
			grade2 = "excellent";
		} else if (totalPoint>=70) {
			grade = "C";
			grade2 = "good";
		} else if (totalPoint>=60) {
			grade = "D";
			grade2 = "good";
		} else {
			grade = "F";
			grade2 = "poor";
		}
		
		System.out.println("성적 = " + String.format("%.2f", totalPoint));
		System.out.println("학점 = " + grade);
		System.out.println("학점 = " + grade2);
		
		
		
	}
}

/*  [문제5] 성적 관리 프로그램
중간고사, 기말고사, 레포트, 출석점수를 입력받아서 계산하시오

조건1) (중간+기말)/2    ---> 60%
          과제   	     ---> 20%
          출석                ---> 20%     
조건2)  90이상 'A'학점     		
          80이상 'B'학점        		  	 
          70이상 'C'학점        		  	 
          60이상 'D'학점        		  	 
          나머지 'F'학점
조건3)
         A, B학점  ---->"excellent"     
         C, D학점  ---->"good"
         F학점    ---->"poor"

[실행결과]
중간고사를 입력하시오 : 90
기말고사를 입력하시오 : 89
과제점수를 입력하시오 : 99
출석점수를 입력하시오 : 100

성적=93.50         <---소수이하 2째자리까지
학점=A              
평가=excellent
*/